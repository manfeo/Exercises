package com.company.ex5;

public class Table extends Furniture{
    Table(String type, String material){
        super(material,type);
        if (material == "дерево")
            super.price = 10;
        else
            super.price = 5;
    }
    @Override
    public String toString(){
        return getType() + ": материал - " + getMaterial();
    }
}
