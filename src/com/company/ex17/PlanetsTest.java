package com.company.ex17;

import java.util.Scanner;

public class PlanetsTest {
    private final static double k = 10000000;
    private final static double grav = 6.6743;

    public static double calculateAcceleration(Planets planet){
        return grav * planet.getMass()*k/(planet.getRadius()*planet.getRadius());
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String planet = "";
        while (!planet.equals("9")){
            System.out.println("Выберете планету: ");
            System.out.print("1.Меркурий\n2.Венера\n3.Земля\n4.Марс\n5.Юпитер\n6.Сатурн\n7.Уран\n8.Нептун\n9.Выход\nВаш выбор: ");
            planet = in.nextLine();
            switch (planet){
                case "1":{
                    System.out.println("Сила притяжения Меркурия " + calculateAcceleration(Planets.Mercury));
                    break;
                }
                case "2":{
                    System.out.println("Сила притяжения Венеры is " + calculateAcceleration(Planets.Venus));
                    break;
                }
                case "3":{
                    System.out.println("Сила притяжения Земли is " + calculateAcceleration(Planets.Earth));
                    break;
                }
                case "4":{
                    System.out.println("Сила притяжения Марса is " + calculateAcceleration(Planets.Mars));
                    break;
                }
                case "5":{
                    System.out.println("Сила притяжения Юпитера is " + calculateAcceleration(Planets.Jupiter));
                    break;
                }
                case "6":{
                    System.out.println("Сила притяжения Сатурна is " + calculateAcceleration(Planets.Saturn));
                    break;
                }
                case "7":{
                    System.out.println("Сила притяжения Урана is " + calculateAcceleration(Planets.Uranus));
                    break;
                }
                case "8":{
                    System.out.println("Сила притяжения Нептуна is " + calculateAcceleration(Planets.Neptune));
                    break;
                }
            }
        }
    }
}
