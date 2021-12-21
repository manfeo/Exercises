package com.company.ex23;

public class Car {
    private int serialNumber;

    public Car(int serialNumber){
        this.serialNumber = serialNumber;
    }
    @Override
    public int hashCode(){
        return serialNumber;
    }
}
