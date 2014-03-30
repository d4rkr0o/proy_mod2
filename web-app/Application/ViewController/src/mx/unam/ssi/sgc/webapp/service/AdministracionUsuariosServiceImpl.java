package mx.unam.ssi.sgc.webapp.service;

import java.util.Collections;
import java.util.List;

import model.User;

import mx.unam.ssi.sgc.webapp.persistence.UsuariosDAO;



public class AdministracionUsuariosServiceImpl implements AdministracionUsuariosService{


    private UsuariosDAO usuariosDAO;

    public void setUsuariosDAO(UsuariosDAO usuariosDAO) {
        this.usuariosDAO = usuariosDAO;
    }

    public UsuariosDAO getUsuariosDAO() {
        return usuariosDAO;
    }


    public List<User> getUsuarios() {
        //
        return null;
    }

    
    public void registrarEjemplo(User ejemplo) {
        // TODO Implement this method
        usuariosDAO.insert(ejemplo);
    }
}
