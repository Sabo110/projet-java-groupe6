/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validateur;
import javax.swing.JOptionPane;
/**
 *
 * @author juja
 */
public class ValidateurFormArticle {
    
    public static boolean validerFormAjout(String libele, String prix)
    {
        // on creer un booleen qui va valider le formulaire
        boolean confirm = true;
        
        if(libele.length() == 0)
        {
            confirm = false;
            JOptionPane.showMessageDialog(null, "veuillez renseigner un libele");
              
        }
        else if(prix.length() == 0)
        {
            confirm = false;
            JOptionPane.showMessageDialog(null, "veuillez renseigner un prix");
        }/*
        else if (libele.length() > 0 && libele.matches("^[A-Za-z]+[-' ]?[A-Za-z]$") == false)
        {
            confirm = false;
            JOptionPane.showMessageDialog(null, "veuillez renseigner un libele valide");
              
        }*/
        else if(prix.length() > 0 && prix.matches("^[1-9][0-9]+$")== false)
        {
            confirm = false;
            JOptionPane.showMessageDialog(null, "veuillez renseigner un prix valide (sans decimaux)");
              
        }
        return confirm;
    }
    
    
    // validateur pour le formulaire de modifiaction
    
    public static boolean validerModification(String nouveaunom, String nouveauprix)
    {
        // variable de confirmation
        boolean confirm = true;
        if(nouveaunom.length() == 0 && nouveauprix.length() == 0)
        {
            confirm = false;
            JOptionPane.showMessageDialog(null, "veuillez renseigner les champs à modifier");
        }
        else if(nouveauprix.length() > 0 && nouveauprix.matches("^[1-9][0-9]+$") == false)
        {
            confirm = false;
            JOptionPane.showMessageDialog(null, "veuillez renseigner un prix valide(sans decimaux)");
        }
        return confirm;
                
    }
}
