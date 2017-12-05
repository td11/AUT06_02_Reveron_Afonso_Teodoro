package Modelo;

/**
 * Clase que almacena todas las consultas posibles
 * a la base de datos sakila
 * @author Teddy
 */
public class Consultas {
    
    public final String todosLosActores = "select * from actor";
    public final String insertarActor = "insert into actor (first_name,last_name) values (?,?)";

    public Consultas(){
        
    }

    
    
    
}
