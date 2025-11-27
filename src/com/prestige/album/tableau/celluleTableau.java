package com.prestige.album.tableau;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;

public class celluleTableau extends javax.swing.JPanel {


    public celluleTableau(int numero, String t, String arti, boolean explicit, String lect, String d) {

        initComponents();
        setOpaque(false);
        numeroTitre.setNumero(numero);
        titre.setText(t);
        artiste.setText(arti);
        artiste.setExplicit(explicit);
        lectures.setText(lect);
        duree.setText(d);
        favorite.setOpaque(false);
        more.setOpaque(false);
        
    }
    public celluleTableau(tableRow row){
        initComponents();
        setOpaque(false);
        numeroTitre.setNumero(row.getNumero());
        titre.setText(row.getTitre());
        if(row.getTitre().equals("Don't")){
          titre.setForeground(new Color(30,215,96));
          numeroTitre.setText("");
          numeroTitre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-audio-wave2-20.png")));
        }
        artiste.setText(row.getArtiste());
        artiste.setExplicit(row.isExplicit());
        lectures.setText(row.getLectures());
        duree.setText(row.getDuree());
        favorite.setVisible(false);
        
    }
    public celluleTableau(){
      initComponents();
      setOpaque(false);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numeroTitre = new com.prestige.album.tableau.numeroTitre();
        titre = new com.prestige.fonts.GothamLabel();
        artiste = new com.prestige.album.tableau.artiste();
        lectures = new com.prestige.album.tableau.numeroTitre();
        more = new javax.swing.JLabel();
        duree = new com.prestige.album.tableau.numeroTitre();
        favorite = new javax.swing.JLabel();

        setBackground(new Color (0,0,255,2/10));
        setAutoscrolls(true);
        setMaximumSize(new java.awt.Dimension(1017, 56));
        setMinimumSize(new java.awt.Dimension(1017, 56));
        setPreferredSize(new java.awt.Dimension(1017, 56));

        numeroTitre.setText("1");

        titre.setForeground(new java.awt.Color(255, 255, 255));
        titre.setText("Intro (Difference)");

        artiste.setText("Bryson Tiller");
        artiste.setCursor(new Cursor(Cursor.HAND_CURSOR));
        artiste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                artisteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                artisteMouseExited(evt);
            }
        });

        lectures.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lectures.setText("33956607");

        more.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-more-24.png"))); // NOI18N

        duree.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        duree.setText("1:13");

        favorite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-favorite-24.png"))); // NOI18N
        favorite.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(numeroTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(artiste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titre, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lectures, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(favorite, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(duree, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(more)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(favorite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(artiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lectures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(more, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(duree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(numeroTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void artisteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artisteMouseEntered
        
        artiste.setText("<HTML><U>"+artiste.getText()+"</U></HTML>");
        repaint();
    }//GEN-LAST:event_artisteMouseEntered

    private void artisteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artisteMouseExited
        artiste.setText(artiste.getText().replace("<HTML><U>", "").replace("</U></HTML>", "")); 
        repaint();
    }//GEN-LAST:event_artisteMouseExited
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
    public static com.prestige.album.tableau.artiste artiste;
    public static com.prestige.album.tableau.numeroTitre duree;
    public static javax.swing.JLabel favorite;
    public static com.prestige.album.tableau.numeroTitre lectures;
    private javax.swing.JLabel more;
    public static com.prestige.album.tableau.numeroTitre numeroTitre;
    public static com.prestige.fonts.GothamLabel titre;
    // End of variables declaration//GEN-END:variables
}
