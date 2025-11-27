
package com.prestige.accueil.subSection;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;


public class panelImage extends JPanel {
    
    private BufferedImage image;
    
 public panelImage(){
     setOpaque(false);
     try { 
         image = ImageIO.read(new File("src/com/prestige/images/trapsoul.png"));
     } catch (IOException ex) {
         Logger.getLogger(panelImage.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 
 public void setImage (String path) throws IOException{
     this.image = ImageIO.read(new File(path));
     repaint();
 }
 
 @Override
    public void paint(Graphics graphics){
    
        Graphics2D graph2 = (Graphics2D) graphics.create();
        graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        graph2.setColor(getBackground());
        

        //Area area = new Area(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),10,10));
        
        //graph2.fill(area);
        
        graph2.clip(new RoundRectangle2D.Double(0, 0, getWidth(),getHeight(), 6,6));
        
        
        
        graph2.drawImage(image, 0, 0, null);
        graph2.dispose();
        
        super.paint(graphics);
        
    }

}