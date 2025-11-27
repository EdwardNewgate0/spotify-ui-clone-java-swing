package com.prestige.album.tableau;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;

public class tableauHeader extends JLabel {
       public tableauHeader (String text) {
        super(text);
        setOpaque(true);
        setBackground(Color.WHITE);
        setFont( new Font("sansserif", 1,12));
        setForeground(new Color(102,102,102));
        setBorder(null);
    }
    @Override
    protected void paintComponent (Graphics grphcs){
        super.paintComponent (grphcs);
        grphcs.setColor(new Color(230,230,230));
        grphcs.drawLine(0, getHeight()-1, getWidth(), getHeight()-1);
    } 
}
