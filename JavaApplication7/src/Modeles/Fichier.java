/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juja
 */
public class Fichier {
    private  static FileWriter fw;
    private static BufferedWriter bw;
    private static FileReader fr;
    private static BufferedReader br;
    
    // methode pour ecrire dans un fichier existant
    public static boolean ecrire(File f, String message)
    {
        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            bw.write(message);
            bw.newLine(); // pour le saut de ligne
            bw.close();
            fw.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
    
    // methode pour lire dans un fichier existant
    
    public static String lire(File f)
    {
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            return br.readLine(); // renvoie la premiere ligne du fichier
             
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // methode pour effacer le contenu d'un fichier
    
    public static boolean supprimeContenu(File f)
    {
        
        try {
            new FileWriter(f).close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
                return false;
        }

            
    }
    
    // methode pour creer un fichier
    
    public static void creerFichier(File f)
    {
        try {
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Fichier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
