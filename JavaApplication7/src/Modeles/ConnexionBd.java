/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles;

import java.sql.Connection;
import  java.sql.DriverManager;

/**
 *
 * @author juja
 */
public class ConnexionBd {
    public static Connection getConnexion()
    {
        Connection connexion;
        try {
            // avant de faire la chaine de connxion on instancie le driver
            Class.forName("com.mysql.jdbc.Driver");
            // on fait la chaine de connexion
            connexion = DriverManager.getConnection("jdbc:mysql://localhost/gest_devis", "root", "");
            return  connexion;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
              
    }
    
}
