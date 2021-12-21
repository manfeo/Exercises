package com.company.ex6;

public class PriceableTest {
    public static void main(String[] args){
        Technique myNewTechnique = new Technique(10,"computer");
        Cosmetics myNewCosmetics = new Cosmetics("face",20);
        Products myNewProducts = new Products(15,"fruits");
        System.out.println(myNewTechnique.getPrice() + " " + myNewCosmetics.getPrice() + " " + myNewProducts.getPrice());
    }
}
