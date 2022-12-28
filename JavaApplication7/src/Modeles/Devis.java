/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles;

/**
 *
 * @author juja
 */
public class Devis {
    private int montant;
    private int idclient;
    private String teluser;

    public Devis(int montant, int iclient, String phoneuser)
    {
        this.montant = montant;
        this.idclient = iclient;
        this.teluser = phoneuser;
    }
    
    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public int getIdClient() {
        return idclient;
    }

    public void setIdClient(int idclient) {
        this.idclient = idclient;
    }

    public String getTeluser() {
        return teluser;
    }

    public void setTeluser(String teluser) {
        this.teluser = teluser;
    }
    
    
    
}
