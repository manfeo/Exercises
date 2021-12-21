package com.company.ex18;

public class Chair extends Furniture {
    Chair(String material, String type){
        super(material,type);
        if (material == "кожа")
            super.price = 7;
        else
            super.price = 3;
    }
    @Override
    public String toString(){
        return getType() + ": материал - " + getMaterial();
    }
}
