package com.company.ex20;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год месяц день часы минуты секунды: ");
        int year = in.nextInt();
        int month = in.nextInt() - 1;
        int day = in.nextInt();
        int hour = in.nextInt();
        int min = in.nextInt();
        int sec = in.nextInt();
        System.out.println(new GregorianCalendar(year, month , day, hour, min, sec).getTime() + "\n\n" + new Date(year, month, day, hour, min, sec));
        System.out.println("Мукано Олег. Получил задание " + new GregorianCalendar(2021 - 1, 12 - 1, 3, 11, 10).getTime() + ". " +
                "Сдача работы происходит: " + new Date());
    }
}

