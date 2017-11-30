package es.cifpcm.creacionproyectojsf;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Teddy
 */
@Named(value = "actorBean")
@RequestScoped
public class ActorBean {
    
    private String firstName;
    private String lastName;
   
    public ActorBean() {
    }
    
    public String save(){
        return "ok";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    
}
