package mx.unam.ssi.sgc.webapp.controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.context.FacesContext;
import mx.unam.ssi.sgc.webapp.model.Ejemplo;
import mx.unam.ssi.sgc.webapp.service.EjemploService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;


public class TemplateController extends TemplateForm {
    private EjemploService ejemploService;


    public TemplateController() {
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
 

    /**
     * @return
     */
    public String logIn() {
        // Add event code here...
        return "login";
    }
}
