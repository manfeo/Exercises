package com.company.ex5;

public class Pot extends Dish{
    private double capacity;

    Pot(String type,String color, double capacity){
        super(type, color);
        this.capacity = capacity;
    }
    public double getCapacity(){
        return capacity;
    }
    public void setCapacity(double capacity){
        this.capacity = capacity;
    }
}
