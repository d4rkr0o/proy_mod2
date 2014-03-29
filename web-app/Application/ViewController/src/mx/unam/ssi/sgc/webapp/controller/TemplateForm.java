package mx.unam.ssi.sgc.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import mx.unam.ssi.sgc.webapp.service.AdministracionUsuariosService;
import mx.unam.ssi.sgc.webapp.utils.AbstractMB;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TemplateForm extends AbstractMB{
    
    protected String  signed;

    public TemplateForm() {
        signed="Sign IN";
    }
    
    /************************************************************/
    public void setSigned(String signed) {
        this.signed = signed;
    }

    public String getSigned() {
        return signed;
    }

    
    public String signIn(){
        return "signin";
    }
    public String logIn() {
        //////////////////////////////////////////////////////////////////////
        /*
        List<Ejemplo> ejemplos2;       
        AdministracionUsuariosService ejemploService;
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ejemploService = (AdministracionUsuariosService) context.getBean("ejemploService");
        ejemplos2 = ejemploService.buscarEjemplos();
        List<Ejemplo> list = new ArrayList<Ejemplo>();
        for (Ejemplo e: ejemplos2) {
            System.out.println(e.getPrueba());
        }
        */
        //////////////////////////////////////////////////////////////////////
        return "login";
    }
    public String signed(){
        return "signin";
    }
}
