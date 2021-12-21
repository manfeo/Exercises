package com.company.ex5;

public class Poodle extends Dog{
    Poodle(int age, String name){
        super(age,name);
    }
    @Override
    public String getBreed(){
        return "Poodle";
    }
}
