
package com.prestige.accueil.subSection;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;


public class ball {

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Dimension getSize() {
        return size;
    }

    public void setSize(Dimension size) {
        this.size = size;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public ball(Color color, Dimension size, Point location) {
        this.color = color;
        this.size = size;
        this.location = location;
    }

    public ball(Color color, Point location) {
        this.color = color;
        this.location = location;
    }

    
    public ball(Color color) {
        this.color = color;
    }

    public ball(Dimension size) {
        this.size = size;
    }

    public ball(Point location) {
        this.location = location;
    }
    
    
    Color color;
    Dimension size = new Dimension(50,50);
    Point location;
    
}


