package com.company.ex5;

public class Labrador extends Dog{
    Labrador(int age, String name){
        super(age,name);
    }
    @Override
    public String getBreed(){
        return "Labrador";
    }
}
