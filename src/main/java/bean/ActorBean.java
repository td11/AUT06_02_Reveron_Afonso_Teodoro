package bean;

import DAO.ActorDAO;
import Modelo.Actor;
import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 * La clase bean
 * @author Teddy
 */
@Named(value = "actorBean")
@RequestScoped
public class ActorBean extends Actor {
 
    private ActorDAO actorDao = new ActorDAO();
    
    public ActorBean(){
        
    }
    
    public List<Actor> getActorList() {
        List<Actor> listado = actorDao.selectAll();
        return listado;
    }

}
