package com.prestige.subButton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;


public class outterPanel extends javax.swing.JPanel {

    Color prevBack;
    
    public outterPanel() {
        initComponents();
        setOpaque(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        innerPanel2 = new com.prestige.subButton.innerPanel();
        gothamLabel1 = new com.prestige.fonts.GothamLabel();

        setBackground(new java.awt.Color(114, 114, 114));
        setMaximumSize(new java.awt.Dimension(100, 30));
        setMinimumSize(new java.awt.Dimension(100, 30));
        setPreferredSize(new java.awt.Dimension(100, 30));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        setLayout(new java.awt.GridBagLayout());

        gothamLabel1.setForeground(new java.awt.Color(255, 255, 255));
        gothamLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gothamLabel1.setText("S'abonner");
        gothamLabel1.setFont(new java.awt.Font("Gotham-Bold", 1, 13)); // NOI18N

        javax.swing.GroupLayout innerPanel2Layout = new javax.swing.GroupLayout(innerPanel2);
        innerPanel2.setLayout(innerPanel2Layout);
        innerPanel2Layout.setHorizontalGroup(
            innerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gothamLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );
        innerPanel2Layout.setVerticalGroup(
            innerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gothamLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        add(innerPanel2, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        setBackground(Color.WHITE);
        prevBack = innerPanel2.getBackground();
        innerPanel2.setBackground(Color.BLACK);
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        setBackground(new Color(114,114,114));
       
        if(prevBack.equals(new Color(32,32,32)))
        innerPanel2.setBackground(new Color(32,32,32));
         if(prevBack.equals(new Color(54,25,31)))
            innerPanel2.setBackground(new Color(54,25,31));
    }//GEN-LAST:event_formMouseExited
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
    public static com.prestige.fonts.GothamLabel gothamLabel1;
    public com.prestige.subButton.innerPanel innerPanel2;
    // End of variables declaration//GEN-END:variables
}
