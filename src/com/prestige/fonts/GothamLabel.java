
package com.prestige.fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import javax.swing.JLabel;


public class GothamLabel extends JLabel {
    
    public GothamLabel(){
       try {
                Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("GothamBold.ttf"));
                
                setFont(font.deriveFont(Font.BOLD, 15f));
                
            } catch (FontFormatException | IOException ex) {
                ex.printStackTrace();
            } 
    }
    
    
}
