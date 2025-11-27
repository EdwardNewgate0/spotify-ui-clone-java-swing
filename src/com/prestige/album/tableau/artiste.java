
package com.prestige.album.tableau;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import javax.swing.JLabel;

public class artiste extends JLabel {
    
    String artiste;
    boolean explicit;
    public artiste(){
      try {
                Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/com/prestige/fonts/GothamBook.ttf"));
                
                setFont(font.deriveFont(Font.PLAIN, 14f));
                
            } catch (FontFormatException | IOException ex) {
                ex.printStackTrace();
            }
        setForeground(new Color(172,165,167));  
        
          
    }
    
    public String getArtiste(){
        return this.artiste;
    }
    public void setArtiste(String arti){
        this.artiste = arti;
        setText(arti);
        repaint();
    }
    public void setExplicit(boolean exp){
        this.explicit = exp;
        
        if(exp)
        setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-explicit-20.png")));
    }
    public boolean getExplicit(){
        return this.explicit;
    }
}
