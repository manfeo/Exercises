package com.company.ex23;

public class Man {
    private int dna;

    public Man(int dna){
        this.dna = dna;
    }
    @Override
    public int hashCode(){
        return dna;
    }

}
