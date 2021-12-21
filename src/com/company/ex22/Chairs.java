package com.company.ex22;

public enum Chairs {
    MagicChair("Magic chair"),
    MultifunctionalChair("Multifunctional chair"),
    VictorianChair("Victorian chair");

    private String title;
    Chairs(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
}
