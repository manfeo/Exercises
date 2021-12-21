package com.company.ex6;

public class Car implements Nameable{
    private String name;
    private int power;

    Car(String name, int power){
        this.name = name;
        this.power = power;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPower(int power){
        this.power = power;
    }
    @Override
    public String getName(){
        return name;
    }
    public int getPower(){
        return power;
    }
}
