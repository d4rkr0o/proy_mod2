package mx.unam.ssi.sgc.webapp.controller;

import java.util.ArrayList;

import java.util.List;

import javax.faces.context.FacesContext;

import mx.unam.ssi.sgc.webapp.model.Ejemplo;
import mx.unam.ssi.sgc.webapp.service.EjemploService;

import org.springframework.context.ApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;


public class EjemploController extends EjemploForm {
    private EjemploService ejemploService;


    public EjemploController() {
        ejemplos = new ArrayList<Ejemplo>();
        ejemplos.add(new Ejemplo(1, "asas"));

    }

    public String mostrarDatos() {
        ApplicationContext context = 
            FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
        EjemploService ejemploService = 
            (EjemploService)context.getBean("ejemploService");
        addMessage("Holaaa!!", "Holaaa!!");
        ejemplos = ejemploService.buscarEjemplos();
        List<Ejemplo> list = new ArrayList<Ejemplo>();
        for (Ejemplo e: ejemplos) {
            list.add(new Ejemplo(e.getId(), e.getPrueba()));
        }
        ejemplos = list;
        return "results";
    }

    public String registrar() {
        ApplicationContext context = 
            FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
        EjemploService ejemploService = 
            (EjemploService)context.getBean("ejemploService");
        ejemploService.registrarEjemplo(ejemplo);
        addMessage("Exito!","Se registro correctamente");
        ejemplos = ejemploService.buscarEjemplos();
        ejemplo=new Ejemplo();
        return null;
    }

    public void setEjemploService(EjemploService ejemploService) {
        this.ejemploService = ejemploService;
    }

    public EjemploService getEjemploService() {
        return ejemploService;
    }

//Ismael Hernandez Millares
        public boolean validar(String usuario) {
        /*
        Pattern patron = Pattern.compile("[A-Za-z_]?([A-Za-z0-9](\\.|\\_)?){1,22}");
        Matcher m = patron.matcher(usuario);
        
        if (m.matches()) {
            return true;
        }
        else{
            return false;
        }
        */
            return false;
    }
    
    /*
       public String sha1(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA1");
        byte[] result = md.digest(password.getBytes());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }
    */
}
