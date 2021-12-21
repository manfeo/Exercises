package com.company.ex26;

import java.util.Scanner;

public class CreditCardStrategy implements Pay{
    @Override
    public void pay() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your card info: ");
        String cardInfo = in.nextLine();
        System.out.print("Enter code, that was sent to your telephone: ");
        cardInfo = in.nextLine();
        System.out.println("Successful payment with card!");
    }
}
