package com.company.ex22;

public class VictorianChair implements ChairFactory, Chair{
    @Override
    public Chair crateChair() {
        return new VictorianChair();
    }

    @Override
    public void sittingOnChair() {
        System.out.println("You are sitting on the Victorian Chair!");
    }
}
