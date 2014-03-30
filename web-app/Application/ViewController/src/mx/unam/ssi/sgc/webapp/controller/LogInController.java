package mx.unam.ssi.sgc.webapp.controller;


import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/* MODELO */
import model.SessionObject;
import model.Noticia;
import model.User;

import mx.unam.ssi.sgc.webapp.service.AdministracionUsuariosService;

public class LogInController extends TemplateForm {
    
    private AdministracionUsuariosService ejemploService;
    private String user="";
    private String password="";

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public LogInController(){
        //
    }

    public void setEjemploService(AdministracionUsuariosService ejemploService) {
        this.ejemploService = ejemploService;
    }

    public AdministracionUsuariosService getEjemploService() {
        return ejemploService;
    }
    
    public String closeLogIn() {
        user="";
        password="";
        return "welcome";
    }
    public String pressLogIn(){
        String goes=null;
        //Code goes here...
        user="";
        password="";
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String currentPage = facesContext.getViewRoot().getViewId();
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);
         
        if(session!=null){
            
            if(session.getAttribute("usuario")==null)
            {
            
                User usuario= new User();
                Noticia[] noticias=new Noticia[9];
                SessionObject objects= new SessionObject();
                /*************** USER  **************************************/
                usuario.setNombre(user);
            
                /*************** NOTICIAS ***********************************/
                
                /*************** SESSION OBJECT ****************************/
                objects.setUsuario(usuario);
                objects.setNoticias(noticias);
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario",objects);
                
            }
            else{
                session.removeAttribute("usuario");
            }
            goes="welcome";
        }       
        //....
        return goes;
    }
    

}
