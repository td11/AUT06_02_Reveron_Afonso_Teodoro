package Modelo;

import java.sql.Timestamp;
import java.util.Date;


/**
 *
 * @author Teddy
 */
public class Actor {
    
    private int actor_id;
    private String firstName;
    private String lastName;
    private Date last_update;

    public Actor(int actor_id, String firstName, String lastName, Date last_update) {
        this.actor_id = actor_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.last_update = last_update;
    }

    
    
    public Actor(){
        
    }
    
    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
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

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    
    
    
    
}
