package com.company.ex18;

public abstract class Furniture {
    private String material;
    private String type;
    protected int price;
    Furniture(String material, String type){
        this.material = material;
        this.type = type;
    }
    public String getMaterial(){
        return material;
    }
    public String getType(){
        return type;
    }
}
