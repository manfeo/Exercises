package com.company.ex17;

public enum Planets {
    Mercury("Меркурий",0.33, 2439.7),
    Venus("Венера",4.87, 6051.8),
    Earth("Земля",5.9722, 6371),
    Mars("Марс",0.642, 3396.2),
    Jupiter("Юпитер",1898.6, 71400),
    Saturn("Сатурн",568, 60268),
    Uranus("Уран",86.8, 25360),
    Neptune("Нептун",102, 24622);

    private String title;
    private double mass;
    private double radius;

    Planets(String title,double mass, double radius){
        this.mass = mass;
        this.radius = radius;
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
    public double getMass(){return mass;}
    public double getRadius(){return radius;}
    @Override
    public String toString() {
        return "Pages{" +
                "title='" + title + '\'' +
                '}';
    }
}
