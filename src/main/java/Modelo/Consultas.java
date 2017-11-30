package Modelo;

/**
 * Clase que almacena todas las consultas posibles
 * a la base de datos sakila
 * @author Teddy
 */
public class Consultas {
    
    private final String todosLosActores = "select * from actor";

    public Consultas(){
        
    }
    
    public String getTodosLosActores() {
        return todosLosActores;
    }
    
    
    
}
