package com.company.ex5;

public class Pan extends Dish{
    private boolean isAntiStick;

    Pan(String type,String color, boolean isAntiStick){
        super(type, color);
        this.isAntiStick = isAntiStick;
    }
    public boolean getIsAntiStick(){
        return isAntiStick;
    }
    public void setAntiStick(boolean isAntiStick){
        this.isAntiStick = isAntiStick;
    }
}
