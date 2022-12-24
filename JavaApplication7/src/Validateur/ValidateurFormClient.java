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
public class ValidateurFormClient {
    
    public static boolean validerFormAjout(String txtnom, String txttelephone)
    {
        // on declare le booleen qui va confirmer la validiter du formulaire
        boolean confirm = true;
       if(txtnom.length() == 0)
       {
           confirm = false;
           JOptionPane.showMessageDialog(null, "veuillez renseigner le nom du client");
       }
       /*else if(txtnom.length() > 0 && txtnom.matches("^[A-Za-z]{2,}$") == false)
       {
               confirm = false;
               JOptionPane.showMessageDialog(null, "veuillez renseigner un nom valide");
       }*/
       else if(txttelephone.length() > 0 && txttelephone.matches("^6[5-9][0-9]{7}$") == false)
       {
                confirm  = false;
               JOptionPane.showMessageDialog(null, "veuillez renseigner un numero de telephone valide (camtel exclus)");
       }
       return  confirm;
    }
    
    // validateur pour modifier un client
    
    public static boolean validerModifier(String nouveaunom, String nouveauphone)
    {
        boolean confirm = true;
        
        if(nouveaunom.length() == 0 && nouveauphone.length() == 0)
        {
            confirm  = false;
            JOptionPane.showMessageDialog(null, "veuillez renseigner les champs à modifier");
        }
        else if(nouveauphone.length() > 0 && nouveauphone.matches("^6[5-9][0-9]{7}$") ==  false)
        {
            confirm  = false;
            JOptionPane.showMessageDialog(null, "veuillez renseigner un telephone valide (camtel exclus)");
        }
        
        return confirm;
    }
}
