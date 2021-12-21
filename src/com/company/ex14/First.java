package com.company.ex14;

import java.util.Collections;
import java.util.Stack;
import java.util.Scanner;
public class First {
    public static Stack<Integer> firstPlayer = new Stack<>();
    public static Stack<Integer> secondPlayer = new Stack<>();

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("5 карт первого игрока: ");
        for (int i = 0; i < 5; i++){
            int value = in.nextInt();
            firstPlayer.push(value);
        }
        System.out.print("5 карт второго игрока: ");
        for (int i = 0; i < 5; i++){
            int value = in.nextInt();
            secondPlayer.push(value);
        }

        Collections.reverse(firstPlayer);
        Collections.reverse(secondPlayer);

        for (int i = 0; i < 106; i++){
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()){
                System.out.println((firstPlayer.isEmpty() ? "second " : "first ") + i);
                System.exit(0);
            }

            int first = firstPlayer.pop();
            int second = secondPlayer.pop();

            if (first == 9 && second == 0){
                secondPlayer.add(0,first);
                secondPlayer.add(0,second);
                continue;
            }
            if (second == 9 && first == 0){
                firstPlayer.add(0,first);
                firstPlayer.add(0,second);
                continue;
            }

            if (first < second){
                secondPlayer.add(0,first);
                secondPlayer.add(0,second);
                continue;
            }
            if (second < first){
                firstPlayer.add(0,second);
                firstPlayer.add(0,first);
                continue;
            }
        }
        System.out.println("botva");
    }
}
