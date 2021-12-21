package com.company.ex6;

public class Planet implements Nameable{
    private String name;
    private double weight;
    private double raduis;
    Planet(String name, double weight, double raduis){
        this.name = name;
        this.weight = weight;
        this.raduis = raduis;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setRaduis(double raduis){
        this.raduis = raduis;
    }
    @Override
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    public double getRaduis(){
        return raduis;
    }
}
