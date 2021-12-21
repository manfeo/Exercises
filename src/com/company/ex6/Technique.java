package com.company.ex6;

public class Technique implements Priceable{
    private int price;
    private String type;

    Technique(int price, String type){
        this.price = price;
        this.type = type;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setPrice(int price){
        this.price = price;
    }
    @Override
    public int getPrice(){
        return price;
    }
    public String getType(){
        return type;
    }
}
