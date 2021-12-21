package com.company.ex26;

public class CreditCard {
    private Pay paymentStrategy;

    public CreditCard(){
        this.paymentStrategy = new CreditCardStrategy();
    }

    public void pay(){
        paymentStrategy.pay();
    }

    public void setPaymentStrategy(Pay paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
}
