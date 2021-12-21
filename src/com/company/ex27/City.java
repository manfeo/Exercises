package com.company.ex27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class City {
    private String city;
    private String country;

    City(String city, String country){
        this.city = city;
        this.country = country;
    }

    public static void main(String[] args) {
        City one = new City("Omsk","Russia");
        City two = new City("Moskva","Russia");
        City three = new City("Kiev","Ukraine");
        City four = new City("Harkov","Ukraine");
        ArrayList<String> russia = new ArrayList<>(Arrays.asList(one.city, two.city));
        ArrayList<String> ukraine = new ArrayList<>(Arrays.asList(three.city, four.city));
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        map.put("Russia", russia);
        map.put("Ukraine", ukraine);
        System.out.println(map);
    }
}
