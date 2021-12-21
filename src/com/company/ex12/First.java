package com.company.ex12;
import java.util.Scanner;
public class First {
    public static Student[] iDNumber;

    public static void main(String[] args) {
        iDNumber = new Student[10];
        Scanner in = new Scanner(System.in);
        for (int i=0;i<10;i++) {
            iDNumber[i] = new Student(in.nextInt());
        }
        insertionSort();
        print();
    }

    public static void insertionSort() {
        for (int i = 1; i < 10; i++)
            for (int j = i; j > 0 && iDNumber[j - 1].id > iDNumber[j].id; j--) {
                Student temp = iDNumber[j - 1];
                iDNumber[j - 1] = iDNumber[j];
                iDNumber[j] = temp;
            }
    }
    public static void print(){
        for (int i = 0; i < 10; i++){
            System.out.print(iDNumber[i].id + " ");
        }
    }
}
