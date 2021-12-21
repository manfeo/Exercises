package com.company.ex3;

public class CircleTest {
    public static void main(String[] args){
        Circle circle = new Circle(10);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Square: " + circle.getSquare());
        System.out.println("Circumference: " + circle.getCircumference());
        circle.setRadius(4);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Square: " + circle.getSquare());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}
