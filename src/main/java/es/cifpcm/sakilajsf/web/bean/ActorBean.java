package es.cifpcm.sakilajsf.web.bean;

import Modelo.Actor;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Teddy
 */
@Named(value = "actorBean")
@RequestScoped
public class ActorBean extends Actor {
    
    private List<Actor> getActorList(){
        
    }
    
    
    
    
}
