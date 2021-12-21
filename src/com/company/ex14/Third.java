package com.company.ex14;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Third {
    public static Deque<Integer> firstPlayer = new ArrayDeque<>();
    public static Deque<Integer> secondPlayer = new ArrayDeque<>();

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("5 карт первого игрока: ");
        for (int i = 0; i < 5; i++){
            int value = in.nextInt();
            firstPlayer.addLast(value);
        }
        System.out.print("5 карт второго игрока: ");
        for (int i = 0; i < 5; i++){
            int value = in.nextInt();
            secondPlayer.addLast(value);
        }

        for (int i = 0; i < 106; i++){
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()){
                System.out.println((firstPlayer.isEmpty() ? "second " : "first ") + i);
                System.exit(0);
            }

            int first = firstPlayer.removeFirst();
            int second = secondPlayer.removeFirst();

            if (first == 9 && second == 0){
                secondPlayer.addLast(first);
                secondPlayer.addLast(second);
                continue;
            }
            if (second == 9 && first == 0){
                firstPlayer.addLast(first);
                firstPlayer.addLast(second);
                continue;
            }

            if (first < second){
                secondPlayer.addLast(first);
                secondPlayer.addLast(second);
                continue;
            }
            if (second < first){
                firstPlayer.addLast(second);
                firstPlayer.addLast(first);
                continue;
            }
        }
        System.out.println("botva");
    }
}
