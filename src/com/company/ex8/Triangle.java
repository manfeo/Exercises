package com.company.ex8;
import java.awt.*;
public class Triangle extends Shape{
    public int xPlus;
    public int yPlus;
    Triangle(int x, int y, Color color, String shape, int xPlus, int yPlus){
        super(x,y,color,shape);
        this.xPlus = xPlus;
        this.yPlus = yPlus;
    }
    @Override
    public int[] returnCharacteristics(){
        int[] characteristics = {xPlus,yPlus};
        return characteristics;
    }
}
