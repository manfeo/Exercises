package com.company.ex7;

public class Rectangle extends Shape{

    protected double width;
    protected double length;

    public Rectangle(){
        super();
    };

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return "Class Rectangle, color='" + color + '\'' +
                ", filled=" + filled + '\'' +
                ", width=" + width + '\'' +
                ", length=" + length;
    }
}