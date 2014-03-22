package mx.gob.nafinsa.siag.conciliaciones.controller;

import java.util.List;

import mx.gob.nafinsa.siag.conciliaciones.model.Ejemplo;
import mx.gob.nafinsa.siag.conciliaciones.utils.AbstractMB;

public class EjemploForm extends AbstractMB{
    protected List<Ejemplo> ejemplos;
    protected Ejemplo ejemplo;
    public EjemploForm() {
     ejemplo=new Ejemplo();
    }
    
    public void setEjemplos(List<Ejemplo> ejemplos) {
        this.ejemplos = ejemplos;
    }

    public List<Ejemplo> getEjemplos() {
        return ejemplos;
    }

    public void setEjemplo(Ejemplo ejemplo) {
        this.ejemplo = ejemplo;
    }

    public Ejemplo getEjemplo() {
        return ejemplo;
    }
}
