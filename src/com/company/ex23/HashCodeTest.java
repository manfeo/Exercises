package com.company.ex23;

public class HashCodeTest {

    public static void main(String[] args) {
        Man firstMan = new Man(2020), secondMan = new Man(2020);
        Car firstCar = new Car(22), secondCar = new Car(23);
        String one = "One", two = "One";
        if (firstMan.hashCode() == secondMan.hashCode())
            System.out.println("Люди одинаковые");
        else
            System.out.println("Люди разные");
        if (firstCar.hashCode() == secondCar.hashCode())
            System.out.println("Машины одинаковые");
        else
            System.out.println("Машины разные");
        if (one.hashCode() == two.hashCode())
            System.out.println("Строки равны");
        else
            System.out.println("Строки не равны");
    }

}
