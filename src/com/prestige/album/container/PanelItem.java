package com.prestige.album.container;


import java.awt.Color;
import javax.swing.JPanel;


public class PanelItem extends JPanel {
    
    public PanelItem (){
        
        setBackground(new Color(30,30,30));
        setLayout(new WrapLayout(WrapLayout.CENTER,0,0));
    }
    
}
