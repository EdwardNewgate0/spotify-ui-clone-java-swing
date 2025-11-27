
package com.prestige.album.tableau;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import javax.swing.JLabel;


public class numeroTitre extends JLabel {
    
    private int numero;
    
    public numeroTitre(){
        try {
                Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/com/prestige/fonts/GothamBold.ttf"));
                
                setFont(font.deriveFont(Font.BOLD, 15f));
                
            } catch (FontFormatException | IOException ex) {
                ex.printStackTrace();
            }
        setForeground(new Color(172,165,167));  
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero (int num){
        this.numero = num;
        setText(num+"");
        repaint();
    }
    
}
