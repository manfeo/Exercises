package com.company.ex5;

public abstract class Dog {
    private int age;
    private String name;

    Dog(int age, String name){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void sit(){
        System.out.println("Dog is sitting");
    }
    public void voice(){
        System.out.println("woof");
    }
    public void nearby(){
        System.out.println("Dog is near you");
    }
    public abstract String getBreed();
}
