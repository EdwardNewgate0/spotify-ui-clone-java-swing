
package com.prestige.album.hero;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class heroPanel extends javax.swing.JPanel {

    
    public heroPanel() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new com.prestige.album.hero.panelImage();
        gothamUltraLabel2 = new com.prestige.fonts.GothamUltraLabel();
        gothamUltraLabel1 = new com.prestige.fonts.GothamUltraLabel();
        roundImage1 = new com.prestige.accueil.subSection.roundImage();
        gothamUltraLabel3 = new com.prestige.fonts.GothamUltraLabel();
        gothamUltraLabel4 = new com.prestige.fonts.GothamUltraLabel();
        gothamUltraLabel5 = new com.prestige.fonts.GothamUltraLabel();

        setMaximumSize(new java.awt.Dimension(1085, 276));
        setMinimumSize(new java.awt.Dimension(1085, 276));

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        gothamUltraLabel2.setForeground(new java.awt.Color(255, 255, 255));
        gothamUltraLabel2.setText("TRAPSOUL");
        gothamUltraLabel2.setFont(new java.awt.Font("Gotham-UltraItalic", 1, 125)); // NOI18N

        gothamUltraLabel1.setForeground(new java.awt.Color(255, 255, 255));
        gothamUltraLabel1.setText("ALBUM");
        gothamUltraLabel1.setFont(new java.awt.Font("Gotham-UltraItalic", 1, 14)); // NOI18N

        roundImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/images/bryson.jpeg"))); // NOI18N

        gothamUltraLabel3.setForeground(new java.awt.Color(255, 255, 255));
        gothamUltraLabel3.setText("Bryson Tiller");
        gothamUltraLabel3.setFont(new java.awt.Font("Gotham-UltraItalic", 1, 14)); // NOI18N
        gothamUltraLabel3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gothamUltraLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gothamUltraLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gothamUltraLabel3MouseExited(evt);
            }
        });

        gothamUltraLabel4.setForeground(new java.awt.Color(172, 165, 167));
        gothamUltraLabel4.setText(" 45 min 4 s");
        gothamUltraLabel4.setFont(new java.awt.Font("Gotham-UltraItalic", 1, 14)); // NOI18N

        gothamUltraLabel5.setForeground(new java.awt.Color(255, 255, 255));
        gothamUltraLabel5.setText(" • 2015 • 14 titres,");
        gothamUltraLabel5.setFont(new java.awt.Font("Gotham-UltraItalic", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gothamUltraLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gothamUltraLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roundImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(gothamUltraLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(gothamUltraLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(gothamUltraLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(gothamUltraLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gothamUltraLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roundImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(gothamUltraLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gothamUltraLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(gothamUltraLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gothamUltraLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gothamUltraLabel3MouseEntered
        gothamUltraLabel3.setText("<HTML><U>"+gothamUltraLabel3.getText()+"</U></HTML>");
    }//GEN-LAST:event_gothamUltraLabel3MouseEntered

    private void gothamUltraLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gothamUltraLabel3MouseExited
        gothamUltraLabel3.setText(gothamUltraLabel3.getText().replace("<HTML><U>", "").replace("</U></HTML>", ""));
    }//GEN-LAST:event_gothamUltraLabel3MouseExited
    @Override
    
    protected void paintChildren (Graphics grphcs)
    {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g= new GradientPaint(0,100,new Color(56,26,33),0, getHeight(), new Color(31,14,19)) ;
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(),0,0);
        super.paintChildren(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.prestige.fonts.GothamUltraLabel gothamUltraLabel1;
    private com.prestige.fonts.GothamUltraLabel gothamUltraLabel2;
    private com.prestige.fonts.GothamUltraLabel gothamUltraLabel3;
    private com.prestige.fonts.GothamUltraLabel gothamUltraLabel4;
    private com.prestige.fonts.GothamUltraLabel gothamUltraLabel5;
    private com.prestige.album.hero.panelImage panelImage1;
    private com.prestige.accueil.subSection.roundImage roundImage1;
    // End of variables declaration//GEN-END:variables
}
