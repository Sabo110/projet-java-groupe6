/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author juja
 */
public class Fermerture {
    
    public static int closingApp()
    {
        return JOptionPane.showConfirmDialog(null, "voulez-vous quitter ?", "quitter", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }
    
}
