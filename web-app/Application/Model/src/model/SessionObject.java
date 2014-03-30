package model;

public class SessionObject {
    private User usuario;

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setNoticias(Noticia[] noticias) {
        this.noticias = noticias;
    }

    public Noticia[] getNoticias() {
        return noticias;
    }
    private Noticia[] noticias=new Noticia[9];

}
