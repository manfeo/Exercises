package com.company.ex5;

public abstract class Dish {
    private String type;
    private String color;

    Dish(String type, String color){
        this.type = type;
        this.color = color;
    }
    public String getType(){
        return type;
    }
    public String getColor(){
        return color;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setColor(String color){
        this.color = color;
    }

}
