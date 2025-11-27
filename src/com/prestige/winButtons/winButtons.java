/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.prestige.winButtons;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JFrame;
import main.main;


public class winButtons extends javax.swing.JPanel {

 
    public winButtons() {
        initComponents();
        }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CloseButton = new com.prestige.winButtons.winButton();
        WideButton = new com.prestige.winButtons.winButton();
        ReduceButton = new com.prestige.winButtons.winButton();

        setBackground(new java.awt.Color(0, 0, 0));

        CloseButton.setIcon("/com/prestige/winButtons/icons8-close-15.png");
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseButtonMouseExited(evt);
            }
        });

        WideButton.setIcon("/com/prestige/winButtons/icons8-maximize-button-10.png");
        WideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WideButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WideButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WideButtonMouseExited(evt);
            }
        });

        ReduceButton.setIcon("/com/prestige/winButtons/icons8-subtract-15.png");
        ReduceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReduceButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReduceButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReduceButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(ReduceButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(WideButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CloseButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WideButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReduceButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseEntered
       CloseButton.setBackground(new Color(205,26,43));
    }//GEN-LAST:event_CloseButtonMouseEntered

    private void CloseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseExited
       CloseButton.setBackground(Color.BLACK);
    }//GEN-LAST:event_CloseButtonMouseExited

    private void WideButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WideButtonMouseEntered
        WideButton.setBackground(new Color(63,63,63));
    }//GEN-LAST:event_WideButtonMouseEntered

    private void WideButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WideButtonMouseExited
        WideButton.setBackground(Color.BLACK);
    }//GEN-LAST:event_WideButtonMouseExited

    private void ReduceButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReduceButtonMouseEntered
        ReduceButton.setBackground(new Color(63,63,63));
    }//GEN-LAST:event_ReduceButtonMouseEntered

    private void ReduceButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReduceButtonMouseExited
        ReduceButton.setBackground(Color.BLACK);
    }//GEN-LAST:event_ReduceButtonMouseExited

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void WideButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WideButtonMouseClicked
      /* Frame frame = main.getFrames()[0];
        if (frame.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                frame.setExtendedState(JFrame.NORMAL);
            } else {
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }*/
    }//GEN-LAST:event_WideButtonMouseClicked

    private void ReduceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReduceButtonMouseClicked
        Frame frame = main.getFrames()[0];
        frame.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_ReduceButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.prestige.winButtons.winButton CloseButton;
    private com.prestige.winButtons.winButton ReduceButton;
    private com.prestige.winButtons.winButton WideButton;
    // End of variables declaration//GEN-END:variables
}
