package com.prestige.swing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;


public class circleButtonLike extends javax.swing.JPanel {

   public void setIcon (String path){
       actionIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource(path)));
   }
    public circleButtonLike() {
        initComponents();
        setOpaque(false);
    }
    
    public circleButtonLike(String path) {
        initComponents();
        setOpaque(false);
        setIcon(path);
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actionIcon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(30, 30));
        setMinimumSize(new java.awt.Dimension(30, 30));
        setPreferredSize(new java.awt.Dimension(30, 30));

        actionIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actionIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actionIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actionIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
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
    private javax.swing.JLabel actionIcon;
    // End of variables declaration//GEN-END:variables
}
