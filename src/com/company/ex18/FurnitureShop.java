package com.company.ex18;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class FurnitureShop {

    public static void main(String[] args) {
        Table woodTable = new Table("Стол", "дерево");
        Table steelTable = new Table("Стол", "железо");
        Chair leatherChair = new Chair("кожа", "Стул");
        Chair woodChair = new Chair("дерево", "Стул");
        Cupboard premiumCupboard = new Cupboard("премиальный", "Шкаф");
        Cupboard budgetCupboard = new Cupboard("бюджетный", "Шкаф");
        HashMap<Furniture, Integer> purshasedItems = buy(woodTable,steelTable,leatherChair,woodChair,premiumCupboard,budgetCupboard);
        System.out.println("Спасибо, что посетили наш магазин.");
        if (!purshasedItems.isEmpty()) {
            System.out.println("Ваш список покупок: ");
            for (Map.Entry<Furniture, Integer> pair : purshasedItems.entrySet()) {
                System.out.println(pair.getKey() + " в количестве " + pair.getValue() + " штук");
            }
            System.out.println("До свидания!");
        }
        else
            System.out.println("До свидания!");
    }
    public static HashMap<Furniture, Integer> buy(Table woodTable, Table steelTable, Chair leatherChair, Chair woodChair, Cupboard premiumCupboard, Cupboard budgetCupboard){
        Scanner in = new Scanner(System.in);
        int choice = 0;
        Random random = new Random();
        int money = random.nextInt(50) + 50;
        HashMap<Furniture, Integer> purshasedItems = new HashMap<>();
        String[] neededWords = {"","","","","","","","",""};
        System.out.println("Добро пожаловать в магазин мебели!");
        while(true){
            System.out.print("У Вас " + money + " рублей! В нашем асортименте:\n 1.Стол\n 2.Стул\n 3.Шкаф\n Введите " +
                    "цифру того, что хотите купить. Нажмите \"4\", чтобы выйти\n Ваш выбор: ");
            choice = in.nextInt();
            switch (choice){
                case 1: {
                    neededWords = new String[]{"Стол", "Дерево", "10", "Сталь", "5", "деревянных", "столов", "стальных", "столов"};
                    break;
                }
                case 2: {
                    neededWords = new String[]{"Стул", "Кожа", "7", "Дерево", "3", "кожаных", "стульев", "деревянных", "стульев"};
                    break;
                }
                case 3: {
                    neededWords = new String[]{"Шкаф", "Премиальные материалы", "30", "Бюджетные материалы", "20", "премиальных", "шкафов", "бюджетных", "шкафов"};
                    break;
                }
                case 4: {
                    return purshasedItems;
                }
            }
            while (true) {
                System.out.print(neededWords[0] + " из какого материала Вы хотите?\n 1." + neededWords[1] + " - " +
                        neededWords[2] +  " рублей " +
                        "за штуку\n 2." + neededWords[3] + " - " + neededWords[4] + " рублей " +
                        "за штуку\n 3.Купить что-то другое\n Ваш выбор: ");
                int material = in.nextInt();
                if (material == 1 || material  == 2){
                    Furniture neededUnit = woodTable;
                    if (choice == 1 && material == 2)
                        neededUnit = steelTable;
                    if (choice == 2 && material == 1)
                        neededUnit = leatherChair;
                    if (choice == 2 && material == 2)
                        neededUnit = woodChair;
                    if (choice == 3 && material == 1)
                        neededUnit = premiumCupboard;
                    if (choice == 3 && material == 2)
                        neededUnit = budgetCupboard;
                    if (material == 1) {
                        System.out.print("Сколько " + neededWords[5] + " " + neededWords[6] + " вы хотите купить?\n Ваш выбор: ");
                    }
                    else {
                        System.out.print("Сколько " + neededWords[7] + " " + neededWords[8] + " вы хотите купить?\n Ваш выбор: ");
                    }
                    int amount = in.nextInt();
                    if (!checkFIOINN())
                        break;
                    System.out.println("Это будет стоить: " + neededUnit.price * amount + " рублей");
                    System.out.print("Продолжить?\n 1.Да\n 2.Нет\n Ваш выбор: ");
                    int agreement = in.nextInt();
                    if (agreement == 2)
                        continue;
                    if (money - neededUnit.price * amount < 0)
                        System.out.println("У вас недостаточно средств для покупки");
                    else{
                        money -= neededUnit.price * amount;
                        if (purshasedItems.containsKey(neededUnit))
                            purshasedItems.put(neededUnit,purshasedItems.get(neededUnit) + amount);
                        else
                            purshasedItems.put(neededUnit,amount);
                        if (material == 1)
                            System.out.println("Поздравляем с покупкой! Вы купили " +
                                    amount + " " + neededWords[5] + " " + neededWords[6]);
                        else
                            System.out.println("Поздравляем с покупкой! Вы купили " +
                                    amount + " " + neededWords[7] + " " + neededWords[8]);
                        break;
                    }
                }
                else
                    break;
            }
        }
    }

    private static boolean checkFIOINN() {
        Scanner in = new Scanner(System.in);
        String INN,FIO;
        System.out.print("Введите Ваше ФИО: ");
        FIO = in.nextLine();
        try {
            if (FIO.split(" ").length < 3)
                throw new Exception();
        } catch (Exception e){
            System.out.println("Неправильно введённое ФИО");
            return false;
        }
        System.out.print("Введите Ваш ИНН: ");
        INN = in.nextLine();
        try {
            if (INN.length() < 11 || INN.length() > 12)
                throw new Exception();
        } catch (Exception e){
            System.out.println("Неверно введёный ИНН");
            return false;
        }
        return true;
    }
}
