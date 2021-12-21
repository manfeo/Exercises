package com.company.ex6;

public class Products implements Priceable{
    private int price;
    private String type;

    Products(int price, String type){
        this.price = price;
        this.type = type;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setType(String type){
        this.type = type;
    }
    @Override
    public int getPrice(){
        return price;
    }
    public String getType(){
        return type;
    }
}
