package mx.unam.ssi.sgc.webapp.service;

import java.util.List;
import mx.unam.ssi.sgc.webapp.persistence.UsuariosDAO;



public class AdministracionUsuariosServiceImpl implements AdministracionUsuariosService{


    private UsuariosDAO ejemploDAO;


    public List<String> buscarEjemplos() {
        return null;
    }


    public void setEjemploDAO(UsuariosDAO ejemploDAO) {
        this.ejemploDAO = ejemploDAO;
    }

    public UsuariosDAO getEjemploDAO() {
        return ejemploDAO;
    }

    public void registrarEjemplo(String ejemplo) {
        //ejemploDAO.insert(ejemplo);
    }
}
