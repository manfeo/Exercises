package com.company.ex22;

public class MultiFunctionalChair implements ChairFactory, Chair{
    @Override
    public void sittingOnChair() {
        System.out.println("You are sitting on the Multifunctional Chair!");
    }

    @Override
    public Chair crateChair() {
        return new MultiFunctionalChair();
    }
}
