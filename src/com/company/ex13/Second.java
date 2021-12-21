package com.company.ex13;

import java.util.LinkedList;

public class Second {
    public static void main(String[] args){
        LinkedList<Integer> one = new LinkedList<>();
        for (int i = 0; i < 10; i++)
            one.add(i);
        one.add(10,10);
        System.out.println(one);
        System.out.println(one.contains(3) ? "Yes" : "No");
        System.out.println(one.get(7));
        if (!one.isEmpty()){
            one.remove(8);
        }
        System.out.println(one.get(8));
        one.clear();
        System.out.println(one.size());
    }
}
