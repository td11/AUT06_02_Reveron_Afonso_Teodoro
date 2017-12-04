package bean;

import DAO.ActorDAO;
import Modelo.Actor;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * La clase bean
 * @author Teddy
 */
@Named(value = "actorBean")
@RequestScoped
public class ActorBean {
    
    public ActorBean(){
        
    }
    
    public ArrayList<Actor> getActorList() {
        return new ActorDAO().selectAll();
    }

}
