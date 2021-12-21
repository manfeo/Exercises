package com.company.ex6;

public class Animal implements Nameable{
    private String name;
    private String type;

    Animal(String name, String type){
        this.name = name;
        this.type = type;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setType(String type){
        this.type = type;
    }
    @Override
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
}
