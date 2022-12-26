/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author juja
 */
public class Icon {
    
    
    public static ImageIcon resize(String imgpath, JLabel label)
    {
        // on cree une image d'icon
         ImageIcon imageIcon =  new ImageIcon(imgpath);
         
         // on recupere la vue de l'image
         Image image =  imageIcon.getImage();
         // on redimentionne l'amage pour qu'elle s'adapte au jlabel et on obtient la nouvelle image
        Image newImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        // on cree notre icon image à partir de cette nouvelle image
        ImageIcon newImageIcon = new ImageIcon(newImage);
        return newImageIcon;
    }
    
    public static ImageIcon icon(byte [] tabbytes, JLabel label)
    {
      ImageIcon imgicon =   new ImageIcon(tabbytes);
      // on extrait l'image à patir de l'imageIcon
      Image img = imgicon.getImage();
      // on redimention l'image pour qu'elle s'adapte au jlabel voulu
        Image imgRedimentionne =  img.getScaledInstance(label.getWidth(), label.getHeight(), img.SCALE_SMOOTH);
    // on creer une nouvelle icon à partir de l'image redimentionne
        return new ImageIcon(imgRedimentionne);
    }
}
