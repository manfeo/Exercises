package com.company.ex7;

public class Square extends Rectangle{

    public Square(){
        super();
    };

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide (){
        return length;
    }

    public void setSide (double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Class Square, color='" + color + '\'' +
                ", filled=" + filled + '\'' +
                ", side=" + length;
    }
}
