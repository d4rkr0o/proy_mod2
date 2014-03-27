package mx.unam.ssi.sgc.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import mx.unam.ssi.sgc.webapp.model.Ejemplo;
import mx.unam.ssi.sgc.webapp.service.EjemploService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LogInController extends TemplateForm {
    
    private EjemploService ejemploService;

    public LogInController(){
        renderlogin=true;
    }

    public void setEjemploService(EjemploService ejemploService) {
        this.ejemploService = ejemploService;
    }

    public EjemploService getEjemploService() {
        return ejemploService;
    }

}
