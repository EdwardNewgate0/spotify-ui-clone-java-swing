
package com.prestige.accueil.subSection;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;

public class boutonFlottant extends javax.swing.JPanel {

    
    public boutonFlottant() {
        initComponents();
        setOpaque(false);
        this.setBackground(new Color(30,215,96));
        this.setSize(50,50);
    }
    public Color getColor(){
        return this.getBackground();
    }
    public void setColor(Color color){
        this.setBackground(color);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(50, 50));
        setMinimumSize(new java.awt.Dimension(50, 50));
        setPreferredSize(new java.awt.Dimension(50, 50));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-play-25.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public void paint(Graphics graphics){
    
        Graphics2D graph2 = (Graphics2D) graphics.create();
        graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        graph2.setColor(getBackground());
        Area area = new Area(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),50,50));
        graph2.fill(area);
        graph2.dispose();
        super.paint(graphics);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel icon;
    // End of variables declaration//GEN-END:variables
}
