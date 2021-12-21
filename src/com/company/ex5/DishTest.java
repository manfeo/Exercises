package com.company.ex5;

public class DishTest {
    public static void main(String[] args){
        Pan myNewPan = new Pan("Pan","red", true);
        Plate myNewPlate = new Plate("Plate","white", "Big");
        Pot myNewPot = new Pot("Pot", "black",10.5);
        System.out.println(myNewPan.getType() + ": " + myNewPan.getColor() + ", anti-stick - " + myNewPan.getIsAntiStick());
        myNewPan.setAntiStick(false);
        System.out.println(myNewPan.getType() + ": " + myNewPan.getColor() + ", anti-stick - " + myNewPan.getIsAntiStick());
        System.out.println(myNewPlate.getType() + ": " + myNewPlate.getColor() + ", size - " + myNewPlate.getSize());
        myNewPlate.setSize("Small");
        System.out.println(myNewPlate.getType() + ": " + myNewPlate.getColor() + ", size - " + myNewPlate.getSize());
        System.out.println(myNewPot.getType() + ": " + myNewPot.getColor() + ", capacity - " + myNewPot.getCapacity());
        myNewPot.setCapacity(5.5);
        System.out.println(myNewPot.getType() + ": " + myNewPot.getColor() + ", capacity - " + myNewPot.getCapacity());
    }
}
