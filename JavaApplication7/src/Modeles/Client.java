/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles;

/**
 *
 * @author juja
 */
public class Client {
    private String nomClient;
    private String telephoneClient;
    // ce constructeur est appele si on passe deux parametre en creant une instance de cette classe
    public Client(String nom, String telephone)
    {
        this.nomClient = nom;
        this.telephoneClient = telephone;
    }
    // ce constructeur est appele si on passe un seul parametre en creant une instance de cette classe
    /*
    public  Client(String nom)
    {
        this.nomClient = nom;
    }
    */
    
    

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getTelephoneClient() {
        return telephoneClient;
    }

    public void setTelephoneClient(String telephoneClient) {
        this.telephoneClient = telephoneClient;
    }
    
}
