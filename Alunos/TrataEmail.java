package aula11;

import javax.swing.JOptionPane;

public class TrataEmail {
    
    public int validaEmail(String email){
        
        int r=0;
        
        if ((email.contains("@")) && (email.contains(".")) && (!email.contains(" "))) {
            String usuario = new String(email.substring(0, 
            email.lastIndexOf('@')));
            String dominio = new String(email.substring(email.lastIndexOf('@') + 1, email.length()));
            r=0;
            if ((usuario.length() >=1) && (!usuario.contains("@")) && (dominio.contains(".")) && (!dominio.contains("@")) && (dominio.indexOf(".") >= 1) && (dominio.lastIndexOf(".") < dominio.length() - 1)) {
            } else {
                r=1;
            }
        } else {
            r=1;
        }
    return r;    
    }    
}