package mx.unam.ssi.sgc.webapp.persistence;

import java.util.List;
import model.User;



public interface UsuariosDAO {

    List<User> getUsuarios();
    void insert(User usuario);
}
