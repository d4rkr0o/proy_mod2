package mx.unam.ssi.sgc.webapp.service;

import java.util.List;

import mx.unam.ssi.sgc.webapp.model.Ejemplo;

public interface AdministracionUsuariosService {
   
   List<Ejemplo> buscarEjemplos();
   void registrarEjemplo(Ejemplo ejemplo);
}
