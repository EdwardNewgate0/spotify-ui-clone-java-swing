
package com.prestige.accueil.subSection;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;


public class panel extends javax.swing.JPanel {

    //ball ball ;
    public boutonFlottant ball = new boutonFlottant();
    public Animator animator;
    
    
    public void animer(){
        if(animator !=null && animator.isRunning()){
            animator.stop();
        }
        Point point = new Point(this.getX()+100,this.getY()+95);
        animator = PropertySetter.createAnimator(150, ball, "location", ball.getLocation(), point);
        animator.addTarget(new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction){
                repaint();
                
            }
        });
        animator.setResolution(5);
        animator.start();
    }
    public void retroanimer(){
        if(animator !=null && animator.isRunning()){
            animator.stop();
        }
        Point point = new Point(this.getX()+100,this.getY()+100);
        animator = PropertySetter.createAnimator(250, ball, "location", ball.getLocation(), point);
        animator.addTarget(new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction){
                repaint();
                if(ball.getLocation().equals(new Point(getX()+100,getY()+100)))
                ball.setColor(new Color(0, 0, 255, 2/10));
                ball.icon.setForeground(new Color(0, 0, 255, 2/10));
                
                   //icon.setLocation(ball.getLocation().x, ball.getLocation().y);
            }
        });
        animator.setResolution(5);
        animator.start();
        
    }
    public panel() {
        initComponents();
        setOpaque(false);
        //ball = new ball(new Color(30,215,96),new Point(this.getX()+100,this.getY()+100));
        //ball.setColor(new Color(0, 0, 255, 2/10));
        
        
        this.add(ball);
        ball.setLocation(this.getX()+100,this.getY()+100);
        ball.setColor(new Color(0, 0, 255, 2/10));
        ball.icon.setIcon(null);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMaximumSize(new java.awt.Dimension(159, 151));
        setMinimumSize(new java.awt.Dimension(159, 151));
        setPreferredSize(new java.awt.Dimension(159, 151));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    /*@Override
    public void paint(Graphics graphics){
    
        super.paint(graphics);
        Graphics2D graph2 = (Graphics2D) graphics.create();
        graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graph2.setColor(ball.getColor());
        graph2.fillOval(ball.getLocation().x,ball.getLocation().y,ball.getSize().width,ball.getSize().height);
        
        graph2.dispose();
       
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
