package mx.unam.ssi.sgc.webapp.controller;

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
        //Code goes here...
        user="";
        password="";
        //....
        return "welcome";
    }
    

}
