package com.prestige.album.tableau;

import static com.prestige.album.tableau.celluleTableau.artiste;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.event.MouseInputAdapter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class tableauAlbum extends JTable {
    private int rollOverRowIndex = -1;
    private int numero;
    
    public tableauAlbum(){
               
        
        setShowHorizontalLines(false);
        setBorder(null);
       
        setRowHeight(56);
        this.setBackground(new Color(30,30,30));
        //setGridColor(new Color(230,230,230));
        getTableHeader().setReorderingAllowed(false);
        
        //setGridColor(Color.BLACK);
        
        
        //
        RollOverListener lst = new RollOverListener();
        addMouseMotionListener(lst);
        addMouseListener(lst);
        //
        
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
        @Override
        public Component getTableCellRendererComponent (JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1){
            tableauHeader header = new tableauHeader(o+"");
            if(i1==6)
            {
                header.setHorizontalAlignment(JLabel.CENTER);
            }
            return header;
        }});
        
       setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
           @Override
           
           public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1){
               if(i1 != 0 )
               {
                 Component com= super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
                 com.setBackground(Color.WHITE);
                 setBorder(noFocusBorder);
                 if(bln){
                    com.setForeground(new Color(13,113,182));
                 } else {
                     com.setForeground(new Color(102,102,102));
                 }
                 return com;
               }else {
                   tableRow row = (tableRow)o;
                   celluleTableau cell = new celluleTableau (row);
                   if(bln || (i == rollOverRowIndex)){
                    
                    cell.setBackground(new Color(42,42,42));
                    celluleTableau.numeroTitre.setText("");
                    
                    if(! celluleTableau.titre.getText().equals("Don't"))
                    celluleTableau.numeroTitre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-play-20.png")));
                        
                        celluleTableau.favorite.setVisible(true);
                        celluleTableau.artiste.setForeground(Color.WHITE);
                        celluleTableau.lectures.setForeground(Color.WHITE);
                        celluleTableau.duree.setForeground(Color.WHITE);
                   
                    
                                         
                 } else {

                     cell.setBackground(new Color(0,0,255,2/10));
                 }
                
                   
                   return cell;
               }
           }
           
           
       }); 
       
       addRow(new Object[]{new tableRow(1,"Intro (Difference)","Bryson Tiller",true,"33956607","1:31")});
    }
    
        
    @Override
    public boolean isCellEditable(int row, int column) {                
                return false;               
        };
    
    public void addRow(Object[] row){
        DefaultTableModel model = (DefaultTableModel)getModel();
        model.addRow(row);
    }

    public void removeRow(int i) {
        DefaultTableModel model = (DefaultTableModel)getModel();
        model.removeRow(i);
    }
    
    

    private class RollOverListener extends MouseInputAdapter {

        @Override
        public void mouseExited(MouseEvent e) {
            rollOverRowIndex = -1;
            repaint();
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            int row = rowAtPoint(e.getPoint());
            if( row != rollOverRowIndex ) {
                rollOverRowIndex = row;
                repaint();
            }
        }
    }
    
}
