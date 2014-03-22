package mx.gob.nafinsa.siag.conciliaciones.service;

import java.util.List;

import mx.gob.nafinsa.siag.conciliaciones.model.Ejemplo;
import mx.gob.nafinsa.siag.conciliaciones.persistence.EjemploDAO;



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
