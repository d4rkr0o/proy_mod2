package mx.unam.ssi.sgc.webapp.controller;

import java.security.NoSuchAlgorithmException;

import java.util.List;

import mx.unam.ssi.sgc.webapp.service.AdministracionUsuariosService;
import model.*;
import mx.unam.ssi.sgc.webapp.utils.Cryptography;
import javax.faces.context.FacesContext;

import mx.unam.ssi.sgc.webapp.utils.FormatValidation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SignInController extends TemplateForm {
    private String passwd="";
    private String userId="";
    
    private AdministracionUsuariosService AdminUsuariosService;

    public void setAdminUsuariosService(AdministracionUsuariosService AdminUsuariosService) {
        this.AdminUsuariosService = AdminUsuariosService;
    }

    public AdministracionUsuariosService getAdminUsuariosService() {
        return AdminUsuariosService;
    }




    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    
    public SignInController() {
        super();
    }
    public String closeSignIn() {
        return "welcomesign";
    }
    public String pressSignIn(){
        // Code goes here
        
        if (FormatValidation.validar(userId)){
        User usuario = new User();
        usuario.setUserName(userId);
        try {
            usuario.setPassword(Cryptography.sha1(passwd));
        } catch (NoSuchAlgorithmException e) {
        }
        //////////////////////////////////////////////////////////////////////
        List ejemploService;
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminUsuariosService= (AdministracionUsuariosService) context.getBean("ejemploService");
        AdminUsuariosService.registrarEjemplo(usuario);
        //////////////////////////////////////////////////////////////////////
        // ...
        System.out.println("usuario valido");
        return "welcomesign";
        }
        else{
            System.out.println("ususario invalido");
            return "nosign";
        }
    }
}
