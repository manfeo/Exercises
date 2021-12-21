package com.company.ex2;

public class ShapeTest {
    public static void main(String[] args){
        Shape shape = new Shape("Rectangle", "brown", false);
        System.out.println(shape);
        shape.setType("Triangle");
        shape.setColor("pink");
        shape.setFilled(true);
        System.out.println(shape);
    }
}
