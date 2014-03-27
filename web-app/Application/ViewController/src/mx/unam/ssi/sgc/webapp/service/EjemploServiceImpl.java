package mx.unam.ssi.sgc.webapp.service;

import java.util.List;

import mx.unam.ssi.sgc.webapp.model.Ejemplo;
import mx.unam.ssi.sgc.webapp.persistence.EjemploDAO;



public class EjemploServiceImpl implements EjemploService{


    private EjemploDAO ejemploDAO;


    public List<Ejemplo> buscarEjemplos() {
        return ejemploDAO.buscarEjemplo();
    }


    public void setEjemploDAO(EjemploDAO ejemploDAO) {
        this.ejemploDAO = ejemploDAO;
    }

    public EjemploDAO getEjemploDAO() {
        return ejemploDAO;
    }

    public void registrarEjemplo(Ejemplo ejemplo) {
        ejemploDAO.insert(ejemplo);
    }
}
