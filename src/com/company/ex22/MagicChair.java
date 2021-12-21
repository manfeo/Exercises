package com.company.ex22;

public class MagicChair implements ChairFactory, Chair{
    @Override
    public void sittingOnChair() {
        System.out.println("You are sitting on the Magic Chair");
    }

    @Override
    public Chair crateChair() {
        return new MagicChair();
    }
}
