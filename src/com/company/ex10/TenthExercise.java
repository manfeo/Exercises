package com.company.ex10;
import java.util.Scanner;
public class TenthExercise {
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n: ");
        n = in.nextInt();
        two(n,1);
        System.out.println("\n");
        int a, b;
        System.out.print("Введите A и B: ");
        a = in.nextInt();
        b = in.nextInt();
        three(a, b);
        System.out.println();
        three (b,a);
        System.out.println("\n");
        System.out.print("Введите сколько знаков у числа: ");
        n = in.nextInt();
        System.out.print("Введите чему должна быть равна сумма чисел: ");
        a = in.nextInt();
        System.out.println(four(n,a, 0));
        System.out.print("Введите число, у которого нужно посчитать сумму цифр: ");
        n = in.nextInt();
        System.out.println(five(n));
        System.out.print("Введите число, которое хотите проверить на просту: ");
        n = in.nextInt();
        System.out.println(six(n,n));
    }
    public static void two(int n, int current){
        if (current == n) {
            System.out.print(n);
            return;
        }
        System.out.print(current + " ");
        two(n, current + 1);
    }
    public static void three(int A, int B){
        System.out.print(A + " ");
        if (A < B)
            three(A + 1, B);
        if (A > B)
            three(A - 1, B);
    }
    public static int four(int k, int s,int current){
        int sum = 0;
        int counter = 0;
        int saveCurrent = current;
        current = (int)Math.pow(10,k-1) + current;
        for (int i = 0; i < k ; i++){
            sum += current % 10;
            current /= 10;
            counter++;
        }
        if (current > 0)
            return 0;
        return (sum == s ? four(k, s, saveCurrent + 1) + 1 : four(k, s, saveCurrent + 1) + 0);
    }
    public static int five(int N){
        if (N == 0)
            return 0;
        return five(N / 10) + N % 10;
    }
    public static boolean six(int n, int del){
        del--;
        if (del < 2)
            return true;
        return (n % del == 0 ? false : six(n, del));
    }
}
