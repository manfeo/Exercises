package com.company.ex19;

import java.util.Scanner;

public class TriangleCreation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите углы прямоугольного треугольника: ");
        double first = 0, second = 0, third = 0;
        try {
            first = in.nextInt();
            if (first < 0)
                throw new Exception();
            second = in.nextInt();
            if (second < 0)
                throw new Exception();
            third = in.nextInt();
            if (third < 0)
                throw new Exception();
        } catch (Exception e){
            System.out.println("Значение угла не может быть отрицательным");
            return;
        }
        try {
            if (first != 90 && second != 90 && third != 90)
                throw new Exception();
        } catch (Exception e){
            System.out.println("Один из углов должен быть равен 90 градусов");
            return;
        }
        try{
            if (first + second + third != 180)
                throw new Exception();
        } catch (Exception e){
            System.out.println("Сумма углов в треугольнике должна быть равна 180 градусов");
            return;
        }
        System.out.println("Вы ввели данные треугольника правильно");
    }

}
