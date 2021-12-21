package com.company.ex5;

public class Husky extends Dog{
    Husky(int age, String name){
        super(age,name);
    }
    @Override
    public String getBreed(){
        return "Husky";
    }
}
