package com.company.ex5;

public class DogTest {
    public static void main(String[] args){
        Husky myNewHusky = new Husky(5,"Amir");
        Labrador myNewLabrador = new Labrador(7, "Herda");
        Poodle myNewPoodle = new Poodle(8, "Otis");
        System.out.println(myNewHusky.getBreed() + ": name - " + myNewHusky.getName() + ", age - " + myNewHusky.getAge());
        System.out.println("Command: nearby!");
        myNewHusky.nearby();
        System.out.println(myNewLabrador.getBreed() + ": name - " + myNewLabrador.getName() + ", age - " + myNewLabrador.getAge());
        System.out.println("Command: sit!");
        myNewLabrador.sit();
        System.out.println(myNewPoodle.getBreed() + ": name - " + myNewPoodle.getName() + ", age - " + myNewPoodle.getAge());
        System.out.println("Command: voice!");
        myNewHusky.voice();
    }
}
