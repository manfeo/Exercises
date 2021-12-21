package com.company.ex25;

public class RedShapeDecorator extends ShapeDecorator{
    Shape shape;
    public RedShapeDecorator(Shape shape) {
        super(shape);
        this.shape = shape;
    }
    public void draw(){
        shape.draw();
        setRedBorder();
    }
    private void setRedBorder(){
        System.out.println(" with red borders");
    }
}
