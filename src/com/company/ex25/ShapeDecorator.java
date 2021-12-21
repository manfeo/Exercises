package com.company.ex25;

public class ShapeDecorator implements Shape{
    private Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }
    public void draw(){
        shape.draw();
    }
}
