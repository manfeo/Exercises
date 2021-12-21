package com.company.ex2;

public class Dog {
    private String breed;
    private String name;
    private int age;

    public Dog(String breed, String name, int age){
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getHumanAge() {
        return age*7;
    }

    @Override
    public String toString() {
        return "Class Dog, breed ='" + breed + "\'" +
                ", name='" + name + "\'" +
                ", age=" + age;
    }
}
