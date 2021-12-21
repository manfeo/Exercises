package com.company.ex29;

import java.io.Serializable;

public class CurrencyInfo implements Serializable {

    private final double rub;
    private final double eur;
    private final double usd;

    public CurrencyInfo(double rub, double eur, double usd){
        this.rub = rub;
        this.eur = eur;
        this.usd = usd;
    }


    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "rub=" + rub +
                ", eur=" + eur +
                ", usd=" + usd +
                '}';
    }
}
