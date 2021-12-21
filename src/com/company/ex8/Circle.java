package com.company.ex8;
import java.awt.*;
public class Circle extends Shape{
    public int width;
    public int height;
    Circle(int x, int y, Color color, String shape, int width, int height){
        super(x,y,color,shape);
        this.width = width;
        this.height = height;
    }
    @Override
    public int[] returnCharacteristics(){
        int[] characteristics = {width,height};
        return characteristics;
    }
}
