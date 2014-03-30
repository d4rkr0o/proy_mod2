package mx.unam.ssi.sgc.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;
import model.SessionObject;
import javax.servlet.http.HttpSession;

import mx.unam.ssi.sgc.webapp.service.AdministracionUsuariosService;
import mx.unam.ssi.sgc.webapp.utils.AbstractMB;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TemplateForm extends AbstractMB{
    
    protected String  signed;
    protected String  sessionMsg;

    public void setSessionMsg(String sessionMsg) {
        this.sessionMsg = sessionMsg;
    }
    /* Mensaje de boton Log In*/
    public String getSessionMsg() {
        String value="Log In";
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);
        if (session.getAttribute("usuario")!=null){
            SessionObject objects=(SessionObject)session.getAttribute("usuario");
            return "Log out";           
        }
        return value;
    }


    public void setSigned(String signed) {
        this.signed = signed;
    }
    /* Mensaje de signed*/
    public String getSigned() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);
        if (session.getAttribute("usuario")!=null){
            SessionObject objects=(SessionObject)session.getAttribute("usuario");
            return "Bienvenido "+objects.getUsuario().getNombre();           
        }
        return "Sign IN";
    }

    
    public String signIn(){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);
        if (session.getAttribute("usuario")!=null)
            return "signin";
        return null;
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
}
