package com.company.ex6;

public class Cosmetics implements Priceable{
    private String onWhatPart;
    private int price;

    Cosmetics(String onWhatPart, int price){
        this.onWhatPart = onWhatPart;
        this.price = price;
    }
    public void setOnWhatPart(String onWhatPart){
        this.onWhatPart = onWhatPart;
    }
    public void setPrice(int price){
        this.price = price;
    }
    @Override
    public int getPrice(){
        return price;
    }
    public String getOnWhatPart(){
        return onWhatPart;
    }
}
