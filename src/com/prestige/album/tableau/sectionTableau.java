
package com.prestige.album.tableau;



public class sectionTableau extends javax.swing.JPanel {

   
    public sectionTableau() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableauAlbum1 = new com.prestige.album.tableau.tableauAlbum();

        setBackground(new java.awt.Color(30, 30, 30));
        setMaximumSize(new java.awt.Dimension(1085, 784));
        setMinimumSize(new java.awt.Dimension(1085, 784));
        setPreferredSize(new java.awt.Dimension(1085, 784));

        tableauAlbum1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableauAlbum1.setGridColor(new java.awt.Color(30, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(tableauAlbum1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableauAlbum1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );

        if (tableauAlbum1.getColumnModel().getColumnCount() > 0) {
            tableauAlbum1.getColumnModel().getColumn(0).setResizable(false);
        }
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.prestige.album.tableau.tableauAlbum tableauAlbum1;
    // End of variables declaration//GEN-END:variables
}
