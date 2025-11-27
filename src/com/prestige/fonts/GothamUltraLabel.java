
package com.prestige.fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import javax.swing.JLabel;

public class GothamUltraLabel extends JLabel {
    public GothamUltraLabel(){
       try {
                Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Gotham-UltraItalic.otf"));
                
                setFont(font.deriveFont(Font.PLAIN, 14f));
                
            } catch (FontFormatException | IOException ex) {
                ex.printStackTrace();
            } 
    }
}
