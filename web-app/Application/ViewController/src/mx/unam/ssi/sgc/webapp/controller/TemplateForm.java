package mx.unam.ssi.sgc.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import mx.unam.ssi.sgc.webapp.model.Ejemplo;
import mx.unam.ssi.sgc.webapp.service.EjemploService;
import mx.unam.ssi.sgc.webapp.utils.AbstractMB;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TemplateForm extends AbstractMB{
    
    protected Ejemplo ejemplo;
    protected String  signed;
    protected boolean renderlogin;

   
    public TemplateForm() {
        signed="Sign IN";
        renderlogin=true;
        ejemplo=new Ejemplo();
    }
    
    public void setEjemplo(Ejemplo ejemplo) {
        this.ejemplo = ejemplo;
    }

    public Ejemplo getEjemplo() {
        return ejemplo;
    }
    /************************************************************/
    public void setSigned(String signed) {
        this.signed = signed;
    }

    public String getSigned() {
        return signed;
    }
    public void setRenderlogin(boolean renderlogin) {
        this.renderlogin = renderlogin;
    }

    public boolean isRenderlogin() {
        return renderlogin;
    }

    public String logIn() {
        // Add event code here...
        List<Ejemplo> ejemplos2;       
        EjemploService ejemploService;
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ejemploService = (EjemploService) context.getBean("ejemploService");
        ejemplos2 = ejemploService.buscarEjemplos();
        List<Ejemplo> list = new ArrayList<Ejemplo>();
        for (Ejemplo e: ejemplos2) {
            System.out.println(e.getPrueba());
        }
        //
        return "login";
    }
}
