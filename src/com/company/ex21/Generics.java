package com.company.ex21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generics {
    private static List<Apple> apples = new ArrayList<>();
    private static List<Pear> pears = new ArrayList<>();
    private static void printList(){
        for (int i = 0; i < apples.size(); i++)
            System.out.print("Apple: color - " + apples.get(i).getColor() + ", price - " +  apples.get(i).getPrice() + ". ");
        System.out.println();
        for (int i = 0; i < pears.size(); i++)
            System.out.print("Pear: color - " + pears.get(i).getColor() + ", price - " +  pears.get(i).getPrice() + ". ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            apples.add(new Apple("Green", i));
        }
        for (int i = 0; i < 5; i++){
            pears.add(new Pear("Red", i));
        }
        printList();
    }
}
