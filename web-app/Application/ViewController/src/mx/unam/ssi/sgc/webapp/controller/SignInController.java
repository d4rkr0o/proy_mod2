package mx.unam.ssi.sgc.webapp.controller;

public class SignInController extends TemplateForm {
    private String userName="";

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserLastName() {
        return userLastName;
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
    private String userLastName="";
    private String passwd="";
    private String userId="";
    
    public SignInController() {
        super();
    }
    public String closeSignIn() {
        return "welcomesign";
    }
    public String pressSignIn(){
        // Code goes here
        // ...
        return "welcomesign";
    }
}
