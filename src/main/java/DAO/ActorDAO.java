package DAO;

import Modelo.Actor;
import Modelo.Conexion;
import Modelo.Consultas;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase es el DAO de actor que implementa la interfaz de metodos y le hace
 * una peticion al modelo de momento solo devolveria una lista de actores
 *
 * @author Teddy
 */
public class ActorDAO implements metodos {

    private PreparedStatement ps;
    private ResultSet rs;
    Conexion miconexion;

    public ActorDAO() {
    }

    @Override
    public ArrayList<Actor> selectAll() {
        ArrayList<Actor> listadevolver = new ArrayList<>();

        try {
            miconexion = new Conexion();
            miconexion.abrirConexion();
            ps = miconexion.getConexion().prepareStatement(new Consultas().todosLosActores);
            rs = ps.executeQuery();

            while (rs.next()) {
                listadevolver.add(new Actor(rs.getInt("actor_id"),rs.getString("first_name"),rs.getString("last_name"), rs.getDate("last_update")));
            }

            rs.close();
            ps.close();
            miconexion.getConexion().close();

        } catch (SQLException ex) {
            Logger.getLogger(ActorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ActorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listadevolver;
    }

    @Override
    public Actor insert(Actor actor) {
        Actor unactor = null;
        
        try {
            miconexion = new Conexion();
            miconexion.abrirConexion();
            ps = miconexion.getConexion().prepareStatement(new Consultas().insertarActor,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, actor.getFirstName());
            ps.setString(2, actor.getLastName());
            ps.executeUpdate();

            unactor.setActor_id(ps.getGeneratedKeys().getInt(1));
            unactor.setFirstName(actor.getFirstName());
            unactor.setLastName(actor.getLastName());
            
            rs.close();
            ps.close();
            miconexion.getConexion().close();

        } catch (SQLException ex) {
            
        } catch (ClassNotFoundException ex) {
            
        }
        
        return unactor;
    }

}
