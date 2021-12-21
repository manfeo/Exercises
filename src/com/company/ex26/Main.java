package com.company.ex26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please, choose your payment method\n1.Online wallet\n2.Credit card");
        Scanner in = new Scanner(System.in);
        System.out.print("Your choice: ");
        String choice = in.nextLine();
        switch (choice) {
            case "1": {
                OnlineWallet payment = new OnlineWallet();
                payment.pay();
                break;
            }
            case "2": {
                CreditCard payment = new CreditCard();
                payment.pay();
                break;
            }
        }
    }
}
