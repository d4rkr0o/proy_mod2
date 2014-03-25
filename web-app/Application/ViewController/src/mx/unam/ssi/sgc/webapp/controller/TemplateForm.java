package mx.unam.ssi.sgc.webapp.controller;

import java.util.List;

import mx.unam.ssi.sgc.webapp.model.Ejemplo;
import mx.unam.ssi.sgc.webapp.utils.AbstractMB;

public class TemplateForm extends AbstractMB{
    protected List<Ejemplo> ejemplos;
    protected Ejemplo ejemplo;
    public TemplateForm() {
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
