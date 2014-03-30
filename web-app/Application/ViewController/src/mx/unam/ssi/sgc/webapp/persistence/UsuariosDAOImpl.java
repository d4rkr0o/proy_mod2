package mx.unam.ssi.sgc.webapp.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import java.util.Collections;
import java.util.List;

import javax.sql.DataSource;

import model.User;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class UsuariosDAOImpl implements UsuariosDAO {

    private JdbcTemplate template;
    
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public JdbcTemplate getTemplate() {
        return template;
    }
    

    @Override
    public void insert(User usuario) {
          
          template.update("INSERT INTO usuarios (idUsuario,nombre,apellido,contrasena,isAdmin) VALUES (?,?,?,?,0)",
                          usuario.getUserName(),usuario.getNombre(),usuario.getApellido(),usuario.getPassword());
         
    }


    @Override
    public List<User> getUsuarios() {
        // TODO Implement this method
        return template.query("SELECT id_prueba,prueba from prueba",new EjemploMapper());
    }

 

    public static class EjemploMapper implements RowMapper {
    
        public String mapRow(ResultSet resultSet, int i) throws SQLException {
           // return    new Ejemplo(resultSet.getInt("id_prueba"),resultSet.getString("prueba"));
            return "";
            
        }
    }
    
    
}
