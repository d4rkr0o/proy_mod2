package mx.gob.nafinsa.siag.conciliaciones.model;

import java.io.Serializable;

public class Ejemplo implements Serializable{
    private int id;
    private String prueba;

    public Ejemplo() {
    }

    public Ejemplo(int id, String prueba) {
        this.id = id;
        this.prueba = prueba;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public String getPrueba() {
        return prueba;
    }
}
