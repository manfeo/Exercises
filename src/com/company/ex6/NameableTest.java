package com.company.ex6;

public class NameableTest {
    public static void main(String[] args){
        Planet myNewPlanet = new Planet("Earth",12092,129091);
        Car myNewCar = new Car("Lada",232323);
        Animal myNewAnimal = new Animal("Backs","Giraffe");
        System.out.println(myNewPlanet.getName() + " " + myNewCar.getName() + " " + myNewAnimal.getName());
    }
}
