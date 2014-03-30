package mx.unam.ssi.sgc.webapp.service;

import java.util.List;
import model.User;

public interface AdministracionUsuariosService {
   
   List<User> getUsuarios();
   void registrarEjemplo(User ejemplo);
}
