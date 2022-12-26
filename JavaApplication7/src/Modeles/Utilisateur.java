/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles;

import java.io.File;

/**
 *
 * @author juja
 */
public class Utilisateur {
    private  String nom;
    private String telephone;
    private String localisation;
    private  String numregistrecorm;
    private File logo;

    
    public Utilisateur(String nom, String phone, String loc, String numcorm, File logo)
    {
        this.nom = nom;
        this.telephone = phone;
        this.localisation = loc;
        this.numregistrecorm = numcorm;
        this.logo = logo;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getNumregistrecorm() {
        return numregistrecorm;
    }

    public void setNumregistrecorm(String numregistrecorm) {
        this.numregistrecorm = numregistrecorm;
    }

    public File getLogo() {
        return logo;
    }

    public void setLogo(File logo) {
        this.logo = logo;
    }
    
    
}
