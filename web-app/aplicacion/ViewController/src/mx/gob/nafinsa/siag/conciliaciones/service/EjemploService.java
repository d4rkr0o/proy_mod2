package mx.gob.nafinsa.siag.conciliaciones.service;

import java.util.List;

import mx.gob.nafinsa.siag.conciliaciones.model.Ejemplo;

public interface EjemploService {
   
   List<Ejemplo> buscarEjemplos();
   void registrarEjemplo(Ejemplo ejemplo);
}
