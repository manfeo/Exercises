package com.company.ex13;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<Integer> one = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            one.add(i);
        System.out.println(one);
        one.add(10,10);
        System.out.println(one);
        System.out.println(one.contains(3) ? "Yes" : "No");
        System.out.println(one.get(7));
        if (!one.isEmpty()){
            one.remove(8);
        }
        System.out.println(one);
        one.clear();
        System.out.println(one.size());
        System.out.println(one);
    }
}
