package com.company.ex2;

public class Shape {
    private String color;
    private boolean filled;
    private String type;

    public Shape(String type, String color, boolean filled){
        this.type = type;
        this.color = color;
        this.filled = filled;
    }

    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Class Shape, type='" + type + "\'" +
                ", filled=" + filled +
                ", color='" + color + "\'";
    }
}
