
package com.prestige.subButton;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;


public class innerPanel extends javax.swing.JPanel {

    
    public innerPanel() {
        initComponents();
        setOpaque(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(32, 32, 32));
        setMaximumSize(new java.awt.Dimension(98, 28));
        setMinimumSize(new java.awt.Dimension(98, 28));
        setPreferredSize(new java.awt.Dimension(98, 28));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public void paint(Graphics graphics){
    
        Graphics2D graph2 = (Graphics2D) graphics.create();
        graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        graph2.setColor(getBackground());
        Area area = new Area(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),30,30));
        graph2.fill(area);
        graph2.dispose();
        super.paint(graphics);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
