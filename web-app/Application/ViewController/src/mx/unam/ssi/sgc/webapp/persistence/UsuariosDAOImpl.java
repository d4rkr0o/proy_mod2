package mx.unam.ssi.sgc.webapp.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class UsuariosDAOImpl implements UsuariosDAO {

    private JdbcTemplate template;
    

    public List<String> buscarEjemplo() {
       return template.query("select id_prueba,prueba from prueba",new EjemploMapper());
         
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void insert(String ejemplo) {
      //  template.update("insert into prueba (id_prueba,prueba) values((select max(id_prueba)+1 from prueba),?)",
      //                  new Object[]{ejemplo.getPrueba()},
       //                 new int[]{Types.VARCHAR});
    }

    public static class EjemploMapper implements RowMapper {
    
        public String mapRow(ResultSet resultSet, int i) throws SQLException {
           // return    new Ejemplo(resultSet.getInt("id_prueba"),resultSet.getString("prueba"));
            return "";
            
        }
    }
    
    
}
