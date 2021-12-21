package com.company.ex25;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.draw();
        System.out.println();
        rectangle.draw();
        System.out.println();
        Shape redBorderCircle = new RedShapeDecorator(new Circle());
        Shape redBorderRectangle = new RedShapeDecorator(new Rectangle());
        redBorderCircle.draw();
        redBorderRectangle.draw();
    }

}
