package com.prestige.album.hero;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;


public class panelImage extends JPanel {
    
    private BufferedImage image;
    int shadowSize = 4;
    float shadowOpacity = 0.20f;
    private Color shadowColor = new Color(33,15,20);
     
    
 public panelImage(){
     setOpaque(false);
     try { 
         image = ImageIO.read(new File("src/com/prestige/images/trap.png"));
     } catch (IOException ex) {
         Logger.getLogger(panelImage.class.getName()).log(Level.SEVERE, null, ex);
     }
     setSize(250,230);
     
 }
 
 public void setImage (String path) throws IOException{
     this.image = ImageIO.read(new File(path));
     repaint();
 }
    
        @Override
    public void paintComponent(Graphics grphcs){
        createShadow(grphcs);
        super.paintComponent(grphcs);
    }
    public void createShadow (Graphics grphcs){
    
        Graphics2D g2 = (Graphics2D) grphcs; 
        
        int size = shadowSize * 2;
        int x = 16;
        int y = 8;
        int width = getWidth() - size;
        int height = getHeight() - size;
        
        BufferedImage img = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = img.createGraphics();
        g.setBackground(getBackground());
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );
        g.fillRoundRect(0, 0, width, height, 0, 0);
        
        ShadowRenderer render = new ShadowRenderer(shadowSize,shadowOpacity,shadowColor);
        g2.drawImage(render.createShadow(img), 0, 0, null);
        g2.drawImage(image, x, y, null);
    }

}