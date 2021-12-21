package com.company.ex5;

public class Plate extends Dish{
    private String size;

    Plate(String type,String color, String size){
        super(type, color);
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }


}
