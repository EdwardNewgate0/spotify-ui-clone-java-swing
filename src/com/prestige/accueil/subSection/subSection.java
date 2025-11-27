
package com.prestige.accueil.subSection;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;
import static main.main.playinSection;
import static main.main.playinSubSection;


public class subSection extends javax.swing.JPanel {

   
    public String compare;
  
    public subSection() {
        initComponents();
        setOpaque(false);
        panel1.ball.icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-play-25.png")));
        compare = panel1.ball.icon.getIcon().toString();
        panel1.ball.icon.setVisible(false);
    }
    
    public void setImage (String path){
       try {
            panelImage1.setImage(path);
            
        } catch (IOException ex) {
            Logger.getLogger(subSection.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public void setRoundImage(String path){
        roundImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource(path)));
        panelImage1.setOpaque(true);
        panelImage1.setBackground(new Color(24,24,24));
    }
    
    public void setDesc (String Title, String Line1, String Line2, boolean explicit){
        gothamLabel1.setText(Title);
        
        if(explicit)
            gothamLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-explicit-20.png")));
            
                gothamLabel2.setText(Line1); 
        
        
        gothamLabel3.setText(Line2);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gothamLabel1 = new com.prestige.fonts.GothamLabel();
        gothamLabel2 = new com.prestige.fonts.GothamLabel();
        gothamLabel3 = new com.prestige.fonts.GothamLabel();
        panelImage1 = new com.prestige.accueil.subSection.panelImage();
        roundImage1 = new com.prestige.accueil.subSection.roundImage();
        panel1 = new com.prestige.accueil.subSection.panel();

        setBackground(new java.awt.Color(24, 24, 24));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(189, 282));
        setMinimumSize(new java.awt.Dimension(189, 282));
        setPreferredSize(new java.awt.Dimension(189, 282));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        gothamLabel1.setForeground(new java.awt.Color(255, 255, 255));
        gothamLabel1.setText("T R A P S O U L");
        gothamLabel1.setFont(new java.awt.Font("Gotham-Bold", 1, 17)); // NOI18N
        gothamLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gothamLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gothamLabel1MouseEntered(evt);
            }
        });

        gothamLabel2.setForeground(new java.awt.Color(179, 179, 179));
        gothamLabel2.setText("Bryson Tiller");
        gothamLabel2.setFont(new java.awt.Font("Gotham-Bold", 1, 13)); // NOI18N
        gothamLabel2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gothamLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gothamLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gothamLabel2MouseExited(evt);
            }
        });

        gothamLabel3.setForeground(new java.awt.Color(179, 179, 179));
        gothamLabel3.setText(" ");
        gothamLabel3.setFont(new java.awt.Font("Gotham-Bold", 1, 13)); // NOI18N
        gothamLabel3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gothamLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gothamLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gothamLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
        );

        roundImage1.add(panel1);
        panel1.setBounds(0, 0, 159, 151);

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gothamLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(gothamLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gothamLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(gothamLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gothamLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gothamLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        setBackground(new Color(40,40,40));
        
        if(panelImage1.getBackground().equals(new Color(24,24,24))){
            panelImage1.setBackground(new Color(40,40,40));
        }
        
        panel1.ball.setColor(new Color(30,215,96));
        //panel1.ball.icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-pause-25.png")));
        panel1.ball.icon.setVisible(true);

        if(panel1.animator !=null && panel1.animator.isRunning()){
            panel1.animator.stop();
        }
        Point point = new Point(panel1.getX()+100,panel1.getY()+95);
        panel1.animator = PropertySetter.createAnimator(150, panel1.ball, "location", panel1.ball.getLocation(), point);
        panel1.animator.addTarget(new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction){
                panel1.repaint();
                
            }
        });
        panel1.animator.setResolution(5);
        panel1.animator.start();
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        setBackground(new Color(24,24,24));
        if(panelImage1.getBackground().equals(new Color(40,40,40))){
            panelImage1.setBackground(new Color(24,24,24));
        }
        
        String iconfilename = this.panel1.ball.icon.getIcon().toString();
        String fileName = iconfilename.substring(iconfilename.lastIndexOf("/"  ) + 1);
                                
        if(playinSection == this.getParent().getName() && playinSubSection == this.getName() && "icons8-pause-25.png".equals(fileName)){
            
        }
        else {
          if(panel1.animator !=null && panel1.animator.isRunning()){
            panel1.animator.stop();
        }
        Point point = new Point(panel1.getX()+100,panel1.getY()+100);
        panel1.animator = PropertySetter.createAnimator(250, panel1.ball, "location", panel1.ball.getLocation(), point);
        panel1.animator.addTarget(new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction){
                panel1.repaint();
                if(panel1.ball.getLocation().equals(new Point(panel1.getX()+100,panel1.getY()+100))){
                    panel1.ball.setColor(new Color(0, 0, 255, 2/10));
                    
                    panel1.ball.icon.setVisible(false);
                }
                
                
                   
            }
        });
        panel1.animator.setResolution(5);
        panel1.animator.start();  
        }
        
    }//GEN-LAST:event_formMouseExited

    private void gothamLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gothamLabel2MouseEntered
        setBackground(new Color(40,40,40));
        
        if(panelImage1.getBackground().equals(new Color(24,24,24))){
            panelImage1.setBackground(new Color(40,40,40));
        }
        
        if(! gothamLabel2.getText().equals(" ") && ! gothamLabel2.getText().equals("Artiste"))
        gothamLabel2.setText("<HTML><U>"+gothamLabel2.getText()+"</U></HTML>");
        
        panel1.ball.icon.setVisible(true);

        if(panel1.animator !=null && panel1.animator.isRunning()){
            panel1.animator.stop();
        }
        Point point = new Point(panel1.getX()+100,panel1.getY()+95);
        panel1.animator = PropertySetter.createAnimator(150, panel1.ball, "location", panel1.ball.getLocation(), point);
        panel1.animator.addTarget(new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction){
                panel1.repaint();
                
            }
        });
        panel1.animator.setResolution(5);
        panel1.animator.start();
    }//GEN-LAST:event_gothamLabel2MouseEntered

    private void gothamLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gothamLabel3MouseExited
        setBackground(new Color(24,24,24));
        if(panelImage1.getBackground().equals(new Color(40,40,40))){
            panelImage1.setBackground(new Color(24,24,24));
        }
        
        if(! gothamLabel3.getText().equals(" "))
        gothamLabel3.setText(gothamLabel3.getText().replace("<HTML><U>", "").replace("</U></HTML>", "")); 
    }//GEN-LAST:event_gothamLabel3MouseExited

    private void gothamLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gothamLabel2MouseExited
        setBackground(new Color(24,24,24));
        if(panelImage1.getBackground().equals(new Color(40,40,40))){
            panelImage1.setBackground(new Color(24,24,24));
        }
        
        if(! gothamLabel2.getText().equals(" "))
        gothamLabel2.setText(gothamLabel2.getText().replace("<HTML><U>", "").replace("</U></HTML>", ""));
    }//GEN-LAST:event_gothamLabel2MouseExited

    private void gothamLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gothamLabel3MouseEntered
        setBackground(new Color(40,40,40));
        
        if(panelImage1.getBackground().equals(new Color(24,24,24))){
            panelImage1.setBackground(new Color(40,40,40));
        }
        
        if(! gothamLabel3.getText().equals(" "))
        gothamLabel3.setText("<HTML><U>"+gothamLabel3.getText()+"</U></HTML>");
        
        panel1.ball.icon.setVisible(true);

        if(panel1.animator !=null && panel1.animator.isRunning()){
            panel1.animator.stop();
        }
        Point point = new Point(panel1.getX()+100,panel1.getY()+95);
        panel1.animator = PropertySetter.createAnimator(150, panel1.ball, "location", panel1.ball.getLocation(), point);
        panel1.animator.addTarget(new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction){
                panel1.repaint();
                
            }
        });
        panel1.animator.setResolution(5);
        panel1.animator.start();
    }//GEN-LAST:event_gothamLabel3MouseEntered

    private void gothamLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gothamLabel1MouseClicked
        if(gothamLabel1.getText().equals("T R A P S O U L"))
        {
            main.main.accueilPanel.setVisible(false);
            main.main.accueilPanel.setEnabled(false);
            main.main.headerPanel.setBackground(new Color(56,26,33));
            main.main.outterPanel1.innerPanel2.setBackground(new Color(56,26,33));
            main.main.albumPanel.setVisible(true);
            main.main.albumPanel.setEnabled(true);
        }
    }//GEN-LAST:event_gothamLabel1MouseClicked

    private void gothamLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gothamLabel1MouseEntered
        setBackground(new Color(40,40,40));
        if(panelImage1.isOpaque()){
           panelImage1.setBackground(new Color(40,40,40));
        }
        panel1.ball.icon.setVisible(true);

        if(panel1.animator !=null && panel1.animator.isRunning()){
            panel1.animator.stop();
        }
        Point point = new Point(panel1.getX()+100,panel1.getY()+95);
        panel1.animator = PropertySetter.createAnimator(150, panel1.ball, "location", panel1.ball.getLocation(), point);
        panel1.animator.addTarget(new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction){
                panel1.repaint();
                
            }
        });
        panel1.animator.setResolution(5);
        panel1.animator.start();
    }//GEN-LAST:event_gothamLabel1MouseEntered
    @Override
    public void paint(Graphics graphics){
    
        Graphics2D graph2 = (Graphics2D) graphics.create();
        graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        graph2.setColor(getBackground());
        Area area = new Area(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),10,10));
        graph2.fill(area);
        
        graph2.dispose();
        super.paint(graphics);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.prestige.fonts.GothamLabel gothamLabel1;
    private com.prestige.fonts.GothamLabel gothamLabel2;
    private com.prestige.fonts.GothamLabel gothamLabel3;
    public com.prestige.accueil.subSection.panel panel1;
    private com.prestige.accueil.subSection.panelImage panelImage1;
    private com.prestige.accueil.subSection.roundImage roundImage1;
    // End of variables declaration//GEN-END:variables
}
