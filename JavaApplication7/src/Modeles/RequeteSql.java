/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
/**
 *
 * @author juja
 */
public class RequeteSql {
    private Statement statement;
    private PreparedStatement pst;
    
    // creeons la requete pour inserer un client
    public void creerClient(Client c)
    {
        try {
            // on fait une requete prepare à partir de l'objet connection
          this.pst =   ConnexionBd.getConnexion().prepareStatement("INSERT INTO client (nom, telephone) VALUES (?, ?)");
          // on lit les parametres de la requetes avec les valeurs de l'objet de type client
          this.pst.setString(1, c.getNomClient());
          this.pst.setString(2, c.getTelephoneClient());
          // on execute la requete
          this.pst.executeUpdate();
          // on affiche un message dans une boite de dialogue
            JOptionPane.showMessageDialog(null, "Enregistré avec succès !");
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    // supprimer un client
    
    public boolean supprimerClient(String nom)
    {
        try {
            // on fait une requete prepare à partir de l'objet connection
          this.pst =   ConnexionBd.getConnexion().prepareStatement("DELETE FROM client WHERE nom = ?");
          // on lit les parametres de la requetes avec les valeurs de l'objet de type client
          this.pst.setString(1, nom);
          // on execute la requete
          this.pst.executeUpdate();
          // on affiche un message dans une boite de dialogue
            JOptionPane.showMessageDialog(null, "supprimé avec succès !");
           return true;
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            return  false;
        }
    }
    
    // creeons la requete pour inserer un article
    public void creerArticle(Article a)
    {
        try {
            // on fait une requete prepare à partir de l'objet connection
          this.pst =   ConnexionBd.getConnexion().prepareStatement("INSERT INTO article (libele, prix) VALUES (?, ?)");
          // on lit les parametres de la requetes avec les valeurs de l'objet de type article
          this.pst.setString(1, a.getLibele());
          this.pst.setInt(2, a.getPrix());
          // on execute la requete
          this.pst.executeUpdate();
          // on affiche un message dans une boite de dialogue
            JOptionPane.showMessageDialog(null, "Enregistré avec succès !");
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // requete pour recuperer les clients
    
    public ResultSet afficherClients()
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("SELECT * FROM client");
            return this.pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            return  null;
        }
        
    }
    // requete pour recuperer un seul client
    public ResultSet afficherClient(String nom)
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("SELECT * FROM client WHERE nom = ?");
            this.pst.setString(1, nom);
            return this.pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            return  null;
        }
        
    }
    // pour modifier un client
    
    public void modifierClient(String anciennom, String nouveaunom, String nouveauphone)
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("UPDATE client SET nom = ? , telephone = ? WHERE nom = ?");
            this.pst.setString(1, nouveaunom);
            this.pst.setString(2, nouveauphone);
            this.pst.setString(3, anciennom);
            this.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "modifié avec succès");
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
    // recuperer tous les articles
    public ResultSet afficherArticles()
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("SELECT * FROM article");
            return this.pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            return  null;
        }
        
    }
    
    // recuperer un seul article
    
    public ResultSet afficherArticle(String libele)
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("SELECT * FROM article WHERE libele = ?");
            this.pst.setString(1, libele);
            return this.pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            return  null;
        }
        
    }
    // modifier un article 
    
    public void modifierArticle(String ancienlibele, String nouveaulibele, int nouveauprix)
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("UPDATE article SET libele = ? , prix = ? WHERE libele = ?");
            this.pst.setString(1, nouveaulibele);
            this.pst.setInt(2, nouveauprix);
            this.pst.setString(3, ancienlibele);
            this.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "modifié avec succès");
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
    // supprimer un article
    
    public boolean supprimerArticle(String libele)
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("DELETE FROM article WHERE libele = ?");
            this.pst.setString(1, libele);
            this.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "supprimé avec succès");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
        }
        
    }
    
    
}
