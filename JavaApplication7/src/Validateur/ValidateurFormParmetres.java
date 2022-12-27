/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validateur;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author juja
 */
public class ValidateurFormParmetres {
    
    
    /*public static boolean validerEnregistrer(String nom, String localisation, String phone, String numcorm)
    {
        
    }*/
    
    public static boolean validerAjout(JTextField nom, JTextField local, JTextField phone, JTextField numcorm, JTextField lienlogo)
    {
        boolean confirm = true;
        if(nom.getText().length() == 0)
        {
            confirm = false;
            JOptionPane.showMessageDialog(null, "renseigner votre nom");
        }
        else if(local.getText().length() == 0)
        {
            confirm = false;
            JOptionPane.showMessageDialog(null, "renseigner votre adresse");
        }
        else if(phone.getText().length()  == 0)
        {
            confirm = false;
            JOptionPane.showMessageDialog(null, "renseigner votre telephone");
        }
        else if(numcorm.getText().length() == 0)
        {
            confirm = false;
            JOptionPane.showMessageDialog(null, "renseigner votre numero de registre de cormmerce");
            
        }
        else if(lienlogo.getText().length() == 0)
        {
            confirm  = false;
            JOptionPane.showMessageDialog(null, "veuillez choisir votre logo");
        }
        else if(phone.getText().length() > 0 && phone.getText().matches("^6[5-9][0-9]{7}$") == false)
        {
            confirm  = false;
            JOptionPane.showMessageDialog(null, "veuillez renseigner un numero de telephone valide (camtel exclus)");
        }
        
        return confirm;
    }
    
    // valider pour la modification
    
    public static boolean validerModifier(JTextField nom, JTextField local, JTextField phone, JTextField numcorm)
    {
        boolean confirm = true;
        if(nom.getText().length() == 0)
        {
            confirm = false;
            JOptionPane.showMessageDialog(null, "renseigner le nom");
        }
        else if(local.getText().length() == 0)
        {
            confirm = false;
            JOptionPane.showMessageDialog(null, "renseigner une adresse");
        }
        else if(phone.getText().length()  == 0)
        {
            confirm = false;
            JOptionPane.showMessageDialog(null, "renseigner un numero de telephone");
        }
        else if(numcorm.getText().length() == 0)
        {
            confirm = false;
            JOptionPane.showMessageDialog(null, "renseigner un numero de registre de cormmerce");
            
        }
        else if(phone.getText().length() > 0 && phone.getText().matches("^6[5-9][0-9]{7}$") == false)
        {
            confirm  = false;
            JOptionPane.showMessageDialog(null, "veuillez renseigner un numero de telephone valide (camtel exclus)");
        }
        
        return confirm;
    }
    
}
