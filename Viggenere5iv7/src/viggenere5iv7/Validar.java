/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viggenere5iv7;

import java.util.regex.*;
import javax.swing.JOptionPane;

/**
 *
 * @author porfi
 */
public class Validar {
    
    public boolean letras(String texto){
        boolean sip = false;
        Pattern p = Pattern.compile("[a-zA-Z].*");
        Matcher txt = p.matcher(texto);
        if (txt.matches() == false) {
            JOptionPane.showMessageDialog(null,"Solo Letras o Llene todos los campos");
        }else{
            sip = true;
        }
        
        return sip;
    
    }
}
