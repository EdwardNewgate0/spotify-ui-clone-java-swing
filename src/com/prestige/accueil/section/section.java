
package com.prestige.accueil.section;

import com.prestige.accueil.subSection.subSection;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import static main.main.playinSection;
import static main.main.playinSubSection;
import static main.main.prevSection;
import static main.main.prevSubSection;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;


public class section extends javax.swing.JPanel {
    
    public section(String name, String cat, boolean suite) {
        initComponents();
        categorie.setText(cat);
        if(!suite)
            gothamLabel1.setVisible(false);
        
        setName(name);
        
        categorie.setName("categorie");
        gothamLabel1.setName("gothamLabel1");
                
        subSection1.setName("subSection1");
        subSection2.setName("subSection2");
        subSection3.setName("subSection3");
        subSection4.setName("subSection4");
        subSection5.setName("subSection5");
        
    }
    public section(String name, String cat, boolean suite, String texteSuite) {
        initComponents();
        categorie.setText(cat);
        if(!suite)
            gothamLabel1.setVisible(false);
        
        gothamLabel1.setText(texteSuite);
        
        setName(name);
        
        categorie.setName("categorie");
        gothamLabel1.setName("gothamLabel1");
                
        subSection1.setName("subSection1");
        subSection2.setName("subSection2");
        subSection3.setName("subSection3");
        subSection4.setName("subSection4");
        subSection5.setName("subSection5");
        
    }
        public void refreshCenter(){
        Component[] sections = main.main.panelItem.getComponents();
            for(Component c : sections){
                if(c.getName().equals(playinSection)){
                    
                    Component[] subSections = ((section) c).getComponents();
                    
                        for(Component co : subSections){
                            if(co.getName().equals(playinSubSection)){
                                
                                subSection sub = (subSection) co;
                                
                                String iconfilename = sub.panel1.ball.icon.getIcon().toString();
                                String fileName = iconfilename.substring(iconfilename.lastIndexOf("/"  ) + 1);
                                System.out.println(fileName);
                                
                                
                                if("icons8-play-25.png".equals(fileName)) //Si c'est play
                                {
                                    System.out.println("Here1");
                                    sub.panel1.ball.icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-pause-25.png")));
                                    sub.panel1.ball.revalidate();
                                }
                                    
                                else
                                { 
                                    System.out.println("Here2");
                                    sub.panel1.ball.icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-play-25.png")));
                                    sub.panel1.ball.revalidate();
                                }
                                
                                if(! prevSection.equals(playinSection) || ! prevSubSection.equals(playinSubSection)){
                                    if(!"".equals(prevSection) && !"".equals(prevSubSection)){
                                        defreshPrevious();
                                    }
                                    prevSection = playinSection;
                                    prevSubSection = playinSubSection;
                                }
                                    
                            }
                            
                        }
                }
            }
    }
        public void defreshPrevious(){
            Component[] sections = main.main.panelItem.getComponents();
            for(Component c : sections){
                if(c.getName().equals(prevSection)){
                    
                    Component[] subSections = ((section) c).getComponents();
                    
                        for(Component co : subSections){
                            if(co.getName().equals(prevSubSection)){
                                
                                subSection sub = (subSection) co;
                                
                                String iconfilename = sub.panel1.ball.icon.getIcon().toString();
                                String fileName = iconfilename.substring(iconfilename.lastIndexOf("/"  ) + 1);
                                System.out.println(fileName);
                                
                                
                                if("icons8-pause-25.png".equals(fileName)) //Si c'est pause
                                {
                                    System.out.println("defresh");
                                    sub.panel1.ball.icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-play-25.png")));
                                    
                                    
                                    
                                    if(sub.panel1.animator !=null && sub.panel1.animator.isRunning()){
                                            sub.panel1.animator.stop();
                                        }
                                        Point point = new Point(sub.panel1.getX()+100,sub.panel1.getY()+100);
                                        sub.panel1.animator = PropertySetter.createAnimator(250, sub.panel1.ball, "location", sub.panel1.ball.getLocation(), point);
                                        sub.panel1.animator.addTarget(new TimingTargetAdapter(){
                                            @Override
                                            public void timingEvent(float fraction){
                                                sub.panel1.repaint();
                                                if(sub.panel1.ball.getLocation().equals(new Point(sub.panel1.getX()+100,sub.panel1.getY()+100))){
                                                    sub.panel1.ball.setColor(new Color(0, 0, 255, 2/10));
                                                    //panel1.ball.icon.setIcon(null);
                                                    sub.panel1.ball.icon.setVisible(false);
                                                }


                                                   //icon.setLocation(ball.getLocation().x, ball.getLocation().y);
                                            }
                                        });
                                        sub.panel1.animator.setResolution(5);
                                        sub.panel1.animator.start();
                                                                }
                                    
                                    else
                                    { 
                                        System.out.println("Error");

                                    }
                                     
                            }
                            
                        }
                }
            }
        }
        


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categorie = new com.prestige.fonts.GothamLabel();
        gothamLabel1 = new com.prestige.fonts.GothamLabel();
        subSection1 = new com.prestige.accueil.subSection.subSection();
        subSection2 = new com.prestige.accueil.subSection.subSection();
        subSection3 = new com.prestige.accueil.subSection.subSection();
        subSection4 = new com.prestige.accueil.subSection.subSection();
        subSection5 = new com.prestige.accueil.subSection.subSection();

        setBackground(new java.awt.Color(30, 30, 30));
        setMaximumSize(new java.awt.Dimension(1025, 330));
        setMinimumSize(new java.awt.Dimension(1025, 330));
        setPreferredSize(new java.awt.Dimension(1025, 330));

        categorie.setForeground(new java.awt.Color(255, 255, 255));
        categorie.setText("Écoutés récemment");
        categorie.setFont(new java.awt.Font("Gotham-Bold", 1, 23)); // NOI18N
        categorie.setCursor(new Cursor(Cursor.HAND_CURSOR));
        categorie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                categorieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                categorieMouseExited(evt);
            }
        });

        gothamLabel1.setForeground(new java.awt.Color(179, 179, 179));
        gothamLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gothamLabel1.setText("VOIR TOUT");
        gothamLabel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gothamLabel1.setFont(new java.awt.Font("Gotham-Bold", 1, 14)); // NOI18N
        gothamLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gothamLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gothamLabel1MouseExited(evt);
            }
        });

        subSection1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subSection1MouseClicked(evt);
            }
        });

        subSection2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subSection2MouseClicked(evt);
            }
        });

        subSection3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subSection3MouseClicked(evt);
            }
        });

        subSection4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subSection4MouseClicked(evt);
            }
        });

        subSection5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subSection5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(categorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gothamLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(subSection1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(subSection2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(subSection3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(subSection4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(subSection5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categorie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gothamLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(subSection1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(subSection2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(subSection5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subSection3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subSection4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void categorieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categorieMouseEntered
       categorie.setText("<HTML><U>"+categorie.getText()+"</U></HTML>");
    }//GEN-LAST:event_categorieMouseEntered

    private void categorieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categorieMouseExited
       categorie.setText(categorie.getText().replace("<HTML><U>", "").replace("</U></HTML>", ""));
    }//GEN-LAST:event_categorieMouseExited

    private void gothamLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gothamLabel1MouseEntered
       gothamLabel1.setText("<HTML><U>"+gothamLabel1.getText()+"</U></HTML>"); 
    }//GEN-LAST:event_gothamLabel1MouseEntered

    private void gothamLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gothamLabel1MouseExited
        gothamLabel1.setText(gothamLabel1.getText().replace("<HTML><U>", "").replace("</U></HTML>", ""));
    }//GEN-LAST:event_gothamLabel1MouseExited

    private void subSection1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subSection1MouseClicked
        main.main.playinSection = getName();
        System.out.println(main.main.playinSection);
        main.main.playinSubSection = "subSection1";
        System.out.println(main.main.playinSubSection);
        
        refreshCenter();
    }//GEN-LAST:event_subSection1MouseClicked

    private void subSection2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subSection2MouseClicked
        main.main.playinSection = getName();
        System.out.println(main.main.playinSection);
        main.main.playinSubSection = "subSection2";
        System.out.println(main.main.playinSubSection);
        
        refreshCenter();
    }//GEN-LAST:event_subSection2MouseClicked

    private void subSection3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subSection3MouseClicked
        main.main.playinSection = getName();
        System.out.println(main.main.playinSection);
        main.main.playinSubSection = "subSection3";
        System.out.println(main.main.playinSubSection);
        
        refreshCenter();
    }//GEN-LAST:event_subSection3MouseClicked

    private void subSection4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subSection4MouseClicked
        main.main.playinSection = getName();
        System.out.println(main.main.playinSection);
        main.main.playinSubSection = "subSection4";
        System.out.println(main.main.playinSubSection);
        
        refreshCenter();
    }//GEN-LAST:event_subSection4MouseClicked

    private void subSection5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subSection5MouseClicked
        main.main.playinSection = getName();
        System.out.println(main.main.playinSection);
        main.main.playinSubSection = "subSection5";
        System.out.println(main.main.playinSubSection);
        
        refreshCenter();
    }//GEN-LAST:event_subSection5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.prestige.fonts.GothamLabel categorie;
    private com.prestige.fonts.GothamLabel gothamLabel1;
    public com.prestige.accueil.subSection.subSection subSection1;
    public com.prestige.accueil.subSection.subSection subSection2;
    public com.prestige.accueil.subSection.subSection subSection3;
    public com.prestige.accueil.subSection.subSection subSection4;
    public com.prestige.accueil.subSection.subSection subSection5;
    // End of variables declaration//GEN-END:variables
}
