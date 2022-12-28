/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validateur;

import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author juja
 */
public class ValidateurFormDevis {
    
    public static boolean validercreer(JTable table)
    {
        boolean confirm = true;
        
        if(table.getRowCount() == 0)
        {
            confirm = false;
            JOptionPane.showMessageDialog(null, "veuillez ajouter des articles au devis");
        }
        return confirm;
    }
}
