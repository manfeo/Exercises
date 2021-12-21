package com.company.ex18;

public class Cupboard extends Furniture {
    Cupboard(String material, String type){
        super(material,type);
        if (material == "премиальный")
            super.price = 30;
        else
            super.price = 20;
    }
    @Override
    public String toString(){
        return getType() + ": материал - " + getMaterial();
    }
}
