
package com.prestige.album.downtable;

import java.awt.Color;


public class downtable extends javax.swing.JPanel {

    public downtable() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        artiste = new com.prestige.album.tableau.artiste();
        artiste1 = new com.prestige.album.tableau.artiste();
        roundRectangle1 = new com.prestige.swing.RoundRectangle();
        artiste2 = new com.prestige.album.tableau.artiste();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 30, 30));
        setMaximumSize(new java.awt.Dimension(1085, 136));
        setMinimumSize(new java.awt.Dimension(1085, 136));
        setPreferredSize(new java.awt.Dimension(1085, 136));

        artiste.setText("© 2015");
        artiste.setFont(new java.awt.Font("Gotham-Book", 0, 13)); // NOI18N
        artiste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                artisteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                artisteMouseExited(evt);
            }
        });

        artiste1.setText("02 Octobre 2015");
        artiste1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                artiste1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                artiste1MouseExited(evt);
            }
        });

        roundRectangle1.setBackground(new java.awt.Color(40, 40, 40));
        roundRectangle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundRectangle1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundRectangle1MouseExited(evt);
            }
        });

        artiste2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        artiste2.setText("1 sortie supplémentaire");
        artiste2.setFont(new java.awt.Font("Gotham-Book", 1, 14)); // NOI18N
        artiste2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                artiste2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                artiste2MouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-sort-down-18.png"))); // NOI18N

        javax.swing.GroupLayout roundRectangle1Layout = new javax.swing.GroupLayout(roundRectangle1);
        roundRectangle1.setLayout(roundRectangle1Layout);
        roundRectangle1Layout.setHorizontalGroup(
            roundRectangle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundRectangle1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(artiste2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(10, 10, 10))
        );
        roundRectangle1Layout.setVerticalGroup(
            roundRectangle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundRectangle1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(roundRectangle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(artiste2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(artiste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(artiste1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 684, Short.MAX_VALUE)
                .addComponent(roundRectangle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundRectangle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(artiste1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(artiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void artisteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artisteMouseEntered

    }//GEN-LAST:event_artisteMouseEntered

    private void artisteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artisteMouseExited
      
    }//GEN-LAST:event_artisteMouseExited

    private void artiste1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artiste1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_artiste1MouseEntered

    private void artiste1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artiste1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_artiste1MouseExited

    private void artiste2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artiste2MouseEntered
        artiste2.setForeground(Color.WHITE);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-sort-down-18(1).png"))); 
    }//GEN-LAST:event_artiste2MouseEntered

    private void artiste2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artiste2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_artiste2MouseExited

    private void roundRectangle1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundRectangle1MouseEntered
        artiste2.setForeground(Color.WHITE);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-sort-down-18(1).png")));
    }//GEN-LAST:event_roundRectangle1MouseEntered

    private void roundRectangle1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundRectangle1MouseExited
        artiste2.setForeground(new Color(172,165,167));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-sort-down-18.png")));
    }//GEN-LAST:event_roundRectangle1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.prestige.album.tableau.artiste artiste;
    public static com.prestige.album.tableau.artiste artiste1;
    public static com.prestige.album.tableau.artiste artiste2;
    private javax.swing.JLabel jLabel1;
    private com.prestige.swing.RoundRectangle roundRectangle1;
    // End of variables declaration//GEN-END:variables
}
