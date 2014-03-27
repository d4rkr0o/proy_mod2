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
        EjemploService ejemploService;
        ApplicationContext context;
        System.out.println("Hola mundo 1");
        context = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
        System.out.println("Hola mundo 2");
        ejemploService = (EjemploService) context.getBean("ejemploService");
        System.out.println("Hola mundo 3");
        ejemplos = ejemploService.buscarEjemplos();
        List<Ejemplo> list = new ArrayList<Ejemplo>();
        for (Ejemplo e: ejemplos) {
            System.out.println(e.getPrueba());
        }
        //
        return "login";
    }
}
