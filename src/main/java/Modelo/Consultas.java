package Modelo;

/**
 * Clase que almacena todas las consultas posibles
 * a la base de datos sakila
 * @author Teddy
 */
public class Consultas {
    
    private final String todosLosActores = "select actor_id,firstname,lastname,last_update from actor";

    public Consultas(){
        
    }
    
    public String getTodosLosActores() {
        return todosLosActores;
    }
    
    
    
}
