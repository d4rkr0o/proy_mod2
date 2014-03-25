package mx.unam.ssi.sgc.webapp.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatValidation {
    public FormatValidation() {
        super();
    }
    //Ismael Hernandez Millares
    public boolean validar(String usuario) {
            
            Pattern patron = Pattern.compile("[A-Za-z_]?([A-Za-z0-9](\\.|\\_)?){1,22}");
            Matcher m = patron.matcher(usuario);
            
            if (m.matches()) {
                return true;
            }
            else{
                return false;
            }

        }
}
