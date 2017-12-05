package bean;

import DAO.ActorDAO;
import Modelo.Actor;
import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

/**
 * La clase bean
 * @author Teddy
 */
@Named(value = "actorBean")
@RequestScoped
public class ActorBean extends Actor{
    
    Actor unactor;
    
    public ActorBean(){
        unactor = new Actor();
    }
    
    @NotNull(message = "Apellidos no puede estar vacio")
    @Override
    public String getLastName(){
        return super.getLastName();
    }
    
    @NotNull(message = "Nombre no puede estar vacio")
    @Override
    public String getFirstName(){
        return super.getFirstName();
    }
    
    
    public ArrayList<Actor> getActorList() {
        return new ActorDAO().selectAll();
    }

    public String save(){

        unactor.setFirstName(getFirstName());
        unactor.setLastName(getLastName());
        
        if(new ActorDAO().insert(unactor)!=null){
            return "actorDetail";
        } else {
            return "errores";
        }
    }
    
    public void error() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Error en la insercion"));
    }
}
