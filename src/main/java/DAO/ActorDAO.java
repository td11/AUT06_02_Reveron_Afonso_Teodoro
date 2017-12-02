package DAO;


import Modelo.Actor;
import Modelo.Conexion;
import Modelo.Consultas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 * Esta clase es el DAO de actor que implementa la interfaz de metodos
 * y le hace una peticion al modelo de momento solo devolveria una lista
 * de actores
 * @author Teddy
 */
public class ActorDAO implements metodos{

    Conexion miconexion;
    Consultas miconsulta;
    
    public ActorDAO(){}
    
    @Override
    public List<Actor> selectAll() {
        List<Actor> listadevolver = null;

        try {
            miconexion.abrirConexion();
            PreparedStatement ps = miconexion.getConexion().prepareStatement(miconsulta.getTodosLosActores());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Actor unactor = new Actor();
                unactor.setActor_id(rs.getInt("actor_id"));
                unactor.setFirstName(rs.getString("first_name"));
                unactor.setLastName(rs.getString("last_name"));
                unactor.setLast_update(rs.getTimestamp("last_update"));
                listadevolver.add(unactor);
            }

            rs.close();
            ps.close();
            miconexion.getConexion().close();

        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }

        return listadevolver;
    }
    
   
}
