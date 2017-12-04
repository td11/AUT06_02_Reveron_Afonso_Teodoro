package DAO;

import Modelo.Actor;
import Modelo.Conexion;
import Modelo.Consultas;
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
    Consultas miconsulta;

    public ActorDAO() {
    }

    @Override
    public ArrayList<Actor> selectAll() {
        ArrayList<Actor> listadevolver = new ArrayList<>();

        try {
            miconexion = new Conexion();
            miconexion.abrirConexion();
            ps = miconexion.getConexion().prepareStatement(miconsulta.todosLosActores);
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
    public void insert(Actor actor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
