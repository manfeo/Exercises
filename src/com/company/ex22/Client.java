package com.company.ex22;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Chairs[] chairs = Chairs.values();
        System.out.println("Which type of chair do you prefer?");
        for (Chairs chair : chairs){
            System.out.println(chair.getTitle());
        }
        System.out.print("Your choice? ");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        ChairFactory chairFactory = null;
        Chair newChair = null;
        switch (choice){
            case 1:{
                chairFactory = new MagicChair();
                newChair = chairFactory.crateChair();
                break;
            }
            case 2:{
                chairFactory = new MultiFunctionalChair();
                newChair = chairFactory.crateChair();
                break;
            }
            case 3:{
                chairFactory = new VictorianChair();
                newChair = chairFactory.crateChair();
                break;
            }
        }
        System.out.println("Congratulations! You've bought a " + chairs[choice - 1].getTitle());
        sit(newChair);
    }
    public static void sit(Chair chair){
        chair.sittingOnChair();
    }
}
