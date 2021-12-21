package com.company.ex8;
import java.awt.*;
public abstract class Shape {
    protected String shape;
    protected Color color;
    protected int x;
    protected int y;
    Shape(int x, int y, Color color, String shape){
        this.x = x;
        this.y = y;
        this.color = color;
        this.shape = shape;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setShape(String shape){
        this.shape = shape;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public int getX(){
        return x;
    }
    public int getY() {
        return y;
    }
    public String getShape() {
        return shape;
    }
    public Color getColor() {
        return color;
    }
    public abstract int[] returnCharacteristics();
}
