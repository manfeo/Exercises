package com.company.ex12;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Second {
    public static Student[] first;
    public static Student[] second;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Student> iDNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            iDNumber.add(new Student(in.nextInt()));
        }
        Collections.sort(iDNumber,new SortingStudentsByGPA());
        for (int i = 0; i < 10; i++){
            System.out.print(iDNumber.get(i).id + " ");
        }
    }
}
