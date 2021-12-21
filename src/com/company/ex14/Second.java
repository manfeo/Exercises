package com.company.ex14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Second {
    public static Queue<Integer> firstPlayer = new LinkedList<>();

    public static Queue<Integer> secondPlayer =  new LinkedList<>();

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("5 карт первого игрока: ");
        for (int i = 0; i < 5; i++){
            int value = in.nextInt();
            firstPlayer.add(value);
        }
        System.out.print("5 карт второго игрока: ");
        for (int i = 0; i < 5; i++){
            int value = in.nextInt();
            secondPlayer.add(value);
        }

        for (int i = 0; i < 106; i++){
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()){
                System.out.println((firstPlayer.isEmpty() ? "second " : "first ") + i);
                System.exit(0);
            }

            int first = firstPlayer.poll();
            int second = secondPlayer.poll();

            if (first == 9 && second == 0){
                secondPlayer.add(first);
                secondPlayer.add(second);
                continue;
            }
            if (second == 9 && first == 0){
                firstPlayer.add(first);
                firstPlayer.add(second);
                continue;
            }

            if (first < second){
                secondPlayer.add(first);
                secondPlayer.add(second);
                continue;
            }
            if (second < first){
                firstPlayer.add(second);
                firstPlayer.add(first);
                continue;
            }
        }
        System.out.println("botva");
    }
}
