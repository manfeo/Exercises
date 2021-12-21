package com.company.ex2;
import java.util.Scanner;

public class DogTest {

    public static void main(String[] args){
        System.out.print("How many dogs you want to add? ");
        Scanner in = new Scanner(System.in);
        int quantity = in.nextInt();
        Dog[] arrayOfDogs = addDogs(quantity);
        for (Dog i : arrayOfDogs)
            System.out.println(i);
    }

    public static Dog[] addDogs(int q){
        Dog[] newArray = new Dog[q];
        for (int i = 0; i < q; i++){
            System.out.println("Enter the traits: ");
            System.out.print("Breed: ");
            Scanner in = new Scanner(System.in);
            String breed = in.next();
            System.out.print("Name: ");
            String name = in.next();
            System.out.print("Age: ");
            int age = in.nextInt();
            Dog dog = new Dog(breed, name, age);
            newArray[i] = dog;
        }
        return newArray;
    }
}
