package com.company.ex14;
import java.util.*;

public class Fourth{
    public static List<Double> firstPlayer = new LinkedList<>();

    public static List<Double> secondPlayer =  new LinkedList<>();

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("5 карт первого игрока: ");
        for (int i = 0; i < 5; i++){
            int value = in.nextInt();
            firstPlayer.add((double)value);
        }
        System.out.print("5 карт второго игрока: ");
        for (int i = 0; i < 5; i++){
            int value = in.nextInt();
            secondPlayer.add((double)value);
        }

        for (int i = 0; i < 106; i++){
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()){
                System.out.println((firstPlayer.isEmpty() ? "second " : "first ") + i);
                System.exit(0);
            }

            double first = firstPlayer.remove(0);
            double second = secondPlayer.remove(0);

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
