package mx.unam.ssi.sgc.webapp.persistence;

import java.util.List;

import mx.unam.ssi.sgc.webapp.model.Ejemplo;

public interface EjemploDAO {

    List<Ejemplo> buscarEjemplo();
    void insert(Ejemplo ejemplo);
}
