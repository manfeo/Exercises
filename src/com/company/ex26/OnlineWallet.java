package com.company.ex26;

public class OnlineWallet {
    private Pay paymentStrategy;
    public OnlineWallet(){
        this.paymentStrategy = new OnlineWalletStrategy();
    }

    public void pay(){
        paymentStrategy.pay();
    }

    public void setPaymentStrategy(Pay paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
}
