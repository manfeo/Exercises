package com.company.ex28;

import java.util.Scanner;

public class CarFactory {
    private Car myCar = new Car("Niva",200,"Red");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarFactory carFactory = new CarFactory();
        CarFactory.CarBuilding.startFactory();
        CarFactory.CarBuilding.buildingCar();
        carFactory.myCar.printInfo();
        CarFactory.CarBuilding.end();
        System.out.print("Please, rate the quality of the car: \nYour decision: ");
        QualityControl qualityControl = new QualityControl() {
            @Override
            public void qualityControl() {
                String line;
                line = scanner.nextLine();
                if (line.equals("Good"))
                    System.out.println("Thank you for rating. This car is yours!");
                else
                    System.out.println("Car is bad! Make another one!");
            }
        };
        qualityControl.qualityControl();
    }
    private class Car{
        private String model;
        private int horsePower;
        private String color;
        private Car(String model, int horsePower, String color){
            this.model = model;
            this.horsePower = horsePower;
            this.color = color;
        }
        public void printInfo(){
            System.out.println("Car: model - " + model + ", horsepower - " + horsePower + ", color - " + color);
        }
    }
    public static class CarBuilding{
        public static void startFactory(){
            System.out.println("Factory was started");
        }
        public static void buildingCar(){
            System.out.println("Beginning of building of car");
        }
        public static void end(){
            System.out.println("Car was built");
        }
    }
}
