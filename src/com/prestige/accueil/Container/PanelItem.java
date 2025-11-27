package com.prestige.accueil.Container;


import java.awt.Color;
import javax.swing.JPanel;


public class PanelItem extends JPanel {
    
    public PanelItem (){
        
        setBackground(new Color(30,30,30));
        setLayout(new WrapLayout(WrapLayout.LEADING,30,30));
    }
    
}
