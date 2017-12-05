package DAO;

import Modelo.Actor;
import java.util.List;

/**
 *
 * @author Teddy
 */
public interface metodos {
    
    /**
     * 
     * Devuelve lista de actores
     * 
     */
    
    public List<Actor> selectAll();
    public Actor insert(Actor actor);
    
}
