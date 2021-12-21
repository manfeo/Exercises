package com.company.ex1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("Sum of the array: " + third(array));
        System.out.println("Args of command line: ");
        fourth(args);
        System.out.println("Harmonic series: ");
        fifth();
        System.out.println("Array of random values: ");
        sixth();
        System.out.print("Enter value to count the factorial: ");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        System.out.print("Factorial: ");
        System.out.print(seventh(value));
    }
    public static int third(int[] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
    public static void fourth(String[] array){
        for (String i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void fifth() {
        System.out.print("1");
        for (int i = 2; i <= 10; i++){
            System.out.print(" + 1/" + i);
        }
        System.out.println();
    }
    public static void sixth() {
        int[] mass = new int[20];
        final Random random = new Random();
        for ( int i = 0; i < 20; i++){
            if (i < 10)
                mass[i] = (int)(Math.random()*20);
            else
                mass[i] = (int)(random.nextInt(20));
        }
        for (int i : mass){
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(mass);
        for (int i : mass){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static int seventh(int n) {
        int fact = 1;
        for (int i = fact + 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
