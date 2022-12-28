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
import java.sql.Blob;

/**
 *
 * @author juja
 */
public class RequeteSql {
    private Statement statement;
    private PreparedStatement pst;
    private ResultSet rs;
    
    
    // creeons la requete pour creer un client
    public void creerClient(Client c)
    {
        try {
            // on fait une requete prepare à partir de l'objet connection et on retourne la valeur de la cle primaire lors de l'enregistrement
          this.pst =   ConnexionBd.getConnexion().prepareStatement("INSERT INTO client (nom, telephone, teluser) VALUES (?, ?, ?)");
          // on lit les parametres de la requetes avec les valeurs de l'objet de type client
          this.pst.setString(1, c.getNomClient());
          this.pst.setString(2, c.getTelephoneClient());
          this.pst.setString(3, Fichier.lire(new File("D:/user.txt")));
          // on execute la requete
           this.pst.executeUpdate();
           // on affiche un message dans une boite de dialogue
            JOptionPane.showMessageDialog(null, "Enregistré avec succès !");
             // on retourne l'id du client enregistré
             //ResultSet rs = this.pst.getGeneratedKeys();
             //rs.next();
             //return  rs.getInt(1);
             
        } catch (Exception e) {
            e.printStackTrace();
            
        }
       
    }
    
    
    // supprimer un client d'un utilisateur
    
    public void supprimerClientUser(String nom)
    {
        try {
            // on fait une requete prepare à partir de l'objet connection
          this.pst =   ConnexionBd.getConnexion().prepareStatement("DELETE FROM client WHERE nom = ? AND teluser = ?");
          // on lit les parametres de la requetes avec les valeurs de l'objet de type client
          this.pst.setString(1, nom);
          this.pst.setString(2, Fichier.lire(new File("D:/user.txt")));
          // on execute la requete
          this.pst.executeUpdate();
          // on affiche un message dans une boite de dialogue
            JOptionPane.showMessageDialog(null, "supprimé avec succès !");
           
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    
    
    
    
    
    
    // requete pour recuperer les clients d'un utilisateur
    
    public ResultSet afficherClientsUser()
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("SELECT * FROM client WHERE teluser = ?");
            this.pst.setString(1, Fichier.lire(new File("D:/user.txt")));
            return this.pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            return  null;
        }
        
    }
    // requete pour recuperer un seul client d'un utilisateur
    public ResultSet afficherClientUser(String nom)
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("SELECT * FROM client WHERE nom = ? AND teluser = ?");
            this.pst.setString(1, nom);
            this.pst.setString(2, Fichier.lire(new File("D:/user.txt")));
            return this.pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            return  null;
        }
        
    }
    
    // recuperer l'id du client d'un utilisateur 
    
    public int getIdClientUser(String nom)
    {
        int id = 0;
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("SELECT id FROM client WHERE nom = ? AND teluser = ?");
            this.pst.setString(1, nom);
            this.pst.setString(2, Fichier.lire(new File("D:/user.txt")));
            this.rs = this.pst.executeQuery();
            rs.next();
            id  = rs.getInt("id");

            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return id;
    }
    
    
    // pour modifier un client
    
    public void modifierClientUser(String anciennom, String nouveaunom, String nouveauphone)
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("UPDATE client SET nom = ? , telephone = ? WHERE nom = ? AND teluser = ?");
            this.pst.setString(1, nouveaunom);
            this.pst.setString(2, nouveauphone);
            this.pst.setString(3, anciennom);
            this.pst.setString(4, Fichier.lire(new File("D:/user.txt")));
            this.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "modifié avec succès");
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
    // creeons la requete pour creer un article
    public void creerArticle(Article a)
    {
        try {
            // on fait une requete prepare à partir de l'objet connection
          this.pst =   ConnexionBd.getConnexion().prepareStatement("INSERT INTO article (libele, prix, teluser) VALUES (?,?,?)");
          // on lit les parametres de la requetes avec les valeurs de l'objet de type article
          this.pst.setString(1, a.getLibele());
          this.pst.setInt(2, a.getPrix());
          this.pst.setString(3, Fichier.lire(new File("D:/user.txt")));
          // on execute la requete
          this.pst.executeUpdate();
          // on affiche un message dans une boite de dialogue
            JOptionPane.showMessageDialog(null, "crée avec succès !");
            //ResultSet rs = this.pst.getGeneratedKeys();
            //rs.next();
            //return  rs.getInt(1);
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
    }
    
    // recuperer tous les articles d'un utilisateur
    public ResultSet afficherArticles()
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("SELECT * FROM article WHERE teluser = ?");
            this.pst.setString(1, Fichier.lire(new File("D:/user.txt")));
            return this.pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            return  null;
        }
        
    }
    
    // recuperer un article d'un utilisateur
    
    public ResultSet getArticleUser(String libele)
    {
        try 
        {
            this.pst = ConnexionBd.getConnexion().prepareStatement("SELECT * FROM article WHERE teluser = ? AND libele = ?");
            this.pst.setString(1, Fichier.lire(new File("D:/user.txt")));
            this.pst.setString(2, libele);
            return  this.pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // recuperer l'id de l'article d'un utiisateur
    
    public int getIdArticleUser(String libele)
    {
        int id = 0;
        try {
            this.pst = ConnexionBd.getConnexion().prepareStatement("SELECT id FROM article WHERE teluser = ? AND libele = ?");
            this.pst.setString(1, Fichier.lire(new File("D:/user.txt")));
            this.pst.setString(2, libele);
            this.rs =  this.pst.executeQuery();
            rs.next();
            id =  rs.getInt("id");
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return id;
        
    }
    
    // recuperer un seul article
    
   /*
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
*/
    // modifier un article d'un utilisateur
    
    public void modifierArticle(String ancienlibele, String nouveaulibele, int nouveauprix)
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("UPDATE article SET libele = ? , prix = ? WHERE teluser = ? AND libele = ? ");
            this.pst.setString(1, nouveaulibele);
            this.pst.setInt(2, nouveauprix);
            this.pst.setString(3, Fichier.lire(new File("D:/user.txt")));
            this.pst.setString(4, ancienlibele);
            this.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "modifié avec succès");
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
    // supprimer un article d'un utilisateur
    
    public void supprimerArticleUser(String libele)
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("DELETE FROM article WHERE libele = ? AND teluser = ?");
            this.pst.setString(1, libele);
            this.pst.setString(2, Fichier.lire(new File("D:/user.txt")));
            this.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "supprimé avec succès");
            
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }
        
    }
    
    // enregistrer les parametres d'un utilisateur
    public void creerParametre(Utilisateur u)
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
            
        } catch (Exception e) {
            e.printStackTrace();
            
            
        }
    }
    
    // modifier les parametres d'un utilisateur cas où il ne change pas de logo
    public void modifierParametreLogoInchanger(String ancienPhone, String nouveauNom, String nouveauloc, String nouveauPhone,  String nouveauNumcorm) 
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("UPDATE utilisateur SET nom = ?, localisation = ?, telephone = ?, num_registre_corm = ? WHERE telephone = ?");
            this.pst.setString(1, nouveauNom);
            this.pst.setString(2, nouveauloc);
            this.pst.setString(3, nouveauPhone);
            //this.pst.setBlob(4, nouveauLogo);
            this.pst.setString(4, nouveauNumcorm);
            this.pst.setString(5, ancienPhone);
            this.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "modifié avec succès");
            
        } catch (Exception ex) {
            ex.printStackTrace();
            
            
        }
    }
    
    // 
    
    // modifier les parametres d'un utilisateur cas où le logo change
    public void modifierParametreLogochange(String ancienPhone, String nouveauNom, String nouveauloc, String nouveauPhone,File nouveauLogo,  String nouveauNumcorm) throws FileNotFoundException 
    {
        try {
            // on prepare notre requete
            this.pst = ConnexionBd.getConnexion().prepareStatement("UPDATE utilisateur SET nom = ?, localisation = ?, telephone = ?, logo = ?, num_registre_corm = ? WHERE telephone = ?");
            InputStream inpt = new FileInputStream(nouveauLogo);
            this.pst.setString(1, nouveauNom);
            this.pst.setString(2, nouveauloc);
            this.pst.setString(3, nouveauPhone);
            this.pst.setBlob(4, inpt);
            this.pst.setString(5, nouveauNumcorm);
            this.pst.setString(6, ancienPhone);
            this.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "modifié avec succès");
            
        } catch (SQLException ex) {
            Logger.getLogger(RequeteSql.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }
    }
    
    // afficher les donnes d'un utilisateur
    
    public ResultSet afficheUser(String phone)
    {
        try {
            this.pst = ConnexionBd.getConnexion().prepareStatement("SELECT * FROM utilisateur WHERE telephone = ?");
            this.pst.setString(1, phone); 
            return this.pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace(); // on affiche l'exception dans la console
            return null;
        }
    }
    
    
    // creons un devis
    
    public int creerDevis(Devis d)
    {
       int id = 0;
        try {
            this.pst = ConnexionBd.getConnexion().prepareStatement("INSERT INTO devis (montant, teluser, id_cl) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            this.pst.setInt(1, d.getMontant());
            this.pst.setString(2, d.getTeluser());
            this.pst.setInt(3, d.getIdClient());
            this.pst.executeUpdate();
            this.rs = this.pst.getGeneratedKeys();
            rs.next(); // on accede au prochain resultat
            id = rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
    
    // associons les articles au devis
    
    public void lierArticleDevis(int idarticle, int iddevis, int qt)
    {
        try {
            this.pst = ConnexionBd.getConnexion().prepareStatement("INSERT INTO devis_article (quantite, id_ar, id_dv) VALUES (?,?,?)");
            this.pst.setInt(1, qt);
            this.pst.setInt(2, idarticle);
            this.pst.setInt(3, iddevis);
            this.pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
