/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;
import java.sql.ResultSet;
import Modeles.RequeteSql;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Validateur.ValidateurFormArticle;
/**
 *
 * @author juja
 */
public class FormulaireModifierArticle extends javax.swing.JFrame {

    /**
     * Creates new form FormulaireModifierArticle
     */
    public FormulaireModifierArticle() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbnomarticlepourmodification = new javax.swing.JComboBox<>();
        btnmodifierarticle = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtnouveauprixarticle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnouveaunonarticle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbprixarticlepourmodification = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modifier un article");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Modifier un article");

        jLabel2.setText("Nom de l'article : ");

        cmbnomarticlepourmodification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbnomarticlepourmodificationActionPerformed(evt);
            }
        });

        btnmodifierarticle.setText("Modifier");
        btnmodifierarticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifierarticleActionPerformed(evt);
            }
        });

        jButton1.setText("Retour à l'accueil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nouveau prix : ");

        jLabel4.setText("Nouveau nom : ");

        txtnouveaunonarticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnouveaunonarticleActionPerformed(evt);
            }
        });

        jLabel5.setText("Prix : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(txtnouveaunonarticle, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cmbnomarticlepourmodification, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cmbprixarticlepourmodification, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtnouveauprixarticle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                                .addComponent(btnmodifierarticle, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbnomarticlepourmodification, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbprixarticlepourmodification, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnouveaunonarticle, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnouveauprixarticle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnmodifierarticle, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnouveaunonarticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnouveaunonarticleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnouveaunonarticleActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // on fait en sorte que l'utilisateur ne puisse fermer la fenetre en cliquant sur la croix rouge
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        try {
            // TODO add your handling code here:
            ResultSet resultSet = new RequeteSql().afficherArticles();
            while (resultSet.next()) {
                cmbnomarticlepourmodification.addItem(resultSet.getString("libele"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormulaireModifierArticle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void cmbnomarticlepourmodificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbnomarticlepourmodificationActionPerformed
        try {
            // TODO add your handling code here:
            
            // supprime tous ce qu'il y'a dans le combobox des prix
            cmbprixarticlepourmodification.removeAllItems();
            // on recupere le libele de l'article selctionné dans le combobox du nom d'article
            String libele = (cmbnomarticlepourmodification.getSelectedItem()).toString();
            ResultSet resultSet = new RequeteSql().getArticleUser(libele);
            if(resultSet.next()) {
               cmbprixarticlepourmodification.addItem(resultSet.getString("prix"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormulaireModifierArticle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbnomarticlepourmodificationActionPerformed

    private void btnmodifierarticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifierarticleActionPerformed
        // TODO add your handling code here:
        int idexAncienlib = cmbnomarticlepourmodification.getSelectedIndex();
        int indexAncienprix = cmbprixarticlepourmodification.getSelectedIndex();
        String ancienlibele = (cmbnomarticlepourmodification.getSelectedItem()).toString();
        String ancienprix = (cmbprixarticlepourmodification.getSelectedItem()).toString();
        String nouveaulibele = txtnouveaunonarticle.getText();
        String nouveauprix = txtnouveauprixarticle.getText();
        if(ValidateurFormArticle.validerModification(nouveaulibele, nouveauprix))
        {
            if(nouveaulibele.length() == 0)
            {
                nouveaulibele = ancienlibele;
            }
            else if(nouveauprix.length() == 0)
            {
                nouveauprix = ancienprix;
            }
            
            RequeteSql requeteSql = new RequeteSql();
            requeteSql.modifierArticle(ancienlibele, nouveaulibele, Integer.parseInt(nouveauprix));
            // on modifie les texts afficher dans les differents combobox
            //on simule la fermerture puis l'ouverture de ce formulaire pour mettre à jour les donnees modifies
            dispose();
            main(null);
            
            
            
        }
    }//GEN-LAST:event_btnmodifierarticleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PageAccueil pageaccueil  = new PageAccueil();
        pageaccueil.setVisible(true);
        pageaccueil.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormulaireModifierArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormulaireModifierArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormulaireModifierArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormulaireModifierArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               FormulaireModifierArticle frModifierArticle =  new FormulaireModifierArticle();
               frModifierArticle.setVisible(true);
               frModifierArticle.setLocationRelativeTo(null);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmodifierarticle;
    private javax.swing.JComboBox<String> cmbnomarticlepourmodification;
    private javax.swing.JComboBox<String> cmbprixarticlepourmodification;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtnouveaunonarticle;
    private javax.swing.JTextField txtnouveauprixarticle;
    // End of variables declaration//GEN-END:variables
}
