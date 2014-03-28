package mx.unam.ssi.sgc.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import mx.unam.ssi.sgc.webapp.model.Ejemplo;
import mx.unam.ssi.sgc.webapp.service.AdministracionUsuariosService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LogInController extends TemplateForm {
    
    private AdministracionUsuariosService ejemploService;

    public LogInController(){
        renderlogin=true;
    }

    public void setEjemploService(AdministracionUsuariosService ejemploService) {
        this.ejemploService = ejemploService;
    }

    public AdministracionUsuariosService getEjemploService() {
        return ejemploService;
    }
    
    public String closeLogIn() {
        return "welcome";
    }
    public String pressLogIn(){
        return "welcome";
    }
    

}
