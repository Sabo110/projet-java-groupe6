/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import Modeles.Fichier;

/**
 *
 * @author juja
 */
public class RequeteSql {
    private Statement statement;
    private PreparedStatement pst;
    
    
    // creeons la requete pour inserer un client
    public int creerClient(Client c)
    {
        try {
            // on fait une requete prepare à partir de l'objet connection et on retourne la valeur de la cle primaire lors de l'enregistrement
          this.pst =   ConnexionBd.getConnexion().prepareStatement("INSERT INTO client (nom, telephone) VALUES (?, ?)",Statement.RETURN_GENERATED_KEYS);
          // on lit les parametres de la requetes avec les valeurs de l'objet de type client
          this.pst.setString(1, c.getNomClient());
          this.pst.setString(2, c.getTelephoneClient());
          // on execute la requete
           this.pst.executeUpdate();
           // on affiche un message dans une boite de dialogue
            JOptionPane.showMessageDialog(null, "Enregistré avec succès !");
             // on retourne l'id du client enregistré
             ResultSet rs = this.pst.getGeneratedKeys();
             rs.next();
             return  rs.getInt(1);
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
       
    }
    
    // asscocier client et utilisateur
    
    public void lierUserClient(String phoneUser, int idClient)
    {
        try {
            this.pst = ConnexionBd.getConnexion().prepareStatement("INSERT INTO utilisateur_client (teluser, id_cl) VALUES (?,?)");
            this.pst.setString(1, phoneUser);
            this.pst.setInt(2, idClient);
            this.pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
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
    
    public void creerParametre(Utilisateur u) throws FileNotFoundException 
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("INSERT INTO utilisateur (nom, localisation, logo, telephone, num_registre_corm) VALUES (?,?,?,?,?)");
            InputStream f = new FileInputStream(u.getLogo());
            this.pst.setString(1, u.getNom());
            this.pst.setString(2, u.getLocalisation());
            this.pst.setBlob(3, f);
            this.pst.setString(4, u.getTelephone());
            this.pst.setString(5, u.getNumregistrecorm());
            this.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "enregistré avec succès");
            
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }
    }
    
    public void modifierParametre(String ancienPhone, String nouveauNom, String nouveauloc, String nouveauPhone,File nouveauLogo,  String nouveauNumcorm) throws FileNotFoundException 
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("UPDATE utilisateur SET nom = ?, localisation = ?, telephone = ?, logo = ?, num_registre_corm = ? WHERE telephone = ?");
            InputStream f = new FileInputStream(nouveauLogo);
            this.pst.setString(1, nouveauNom);
            this.pst.setString(2, nouveauloc);
            this.pst.setString(3, nouveauPhone);
            this.pst.setBlob(4, f);
            this.pst.setString(5, nouveauNumcorm);
            this.pst.setString(6, ancienPhone);
            this.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "modifié avec succès");
            
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }
    }
    
    // afficher un utilisateur
    
    public ResultSet afficheUser(String phone)
    {
        try {
            this.pst = ConnexionBd.getConnexion().prepareStatement("SELECT * FROM utilisateur WHERE telephone = ?");
            this.pst.setString(1, phone); // je recupere le numero de telephone de l'utilisateur dans le fichier user.txt
            return this.pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace(); // on affiche l'exception dans la console
            return null;
        }
    }
    
    
}
