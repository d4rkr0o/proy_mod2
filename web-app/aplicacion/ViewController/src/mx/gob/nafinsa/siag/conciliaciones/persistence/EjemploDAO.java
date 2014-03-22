package mx.gob.nafinsa.siag.conciliaciones.persistence;

import java.util.List;

import mx.gob.nafinsa.siag.conciliaciones.model.Ejemplo;

public interface EjemploDAO {

    List<Ejemplo> buscarEjemplo();
    void insert(Ejemplo ejemplo);
}
