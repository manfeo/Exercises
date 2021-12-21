package com.company.ex12;
import java.util.Scanner;
public class Third {
    public static Student[] first = new Student[10];
    public static Student[] second = new Student[10];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
            first[i] = new Student(in.nextInt());
        for (int i = 0 ; i < 10; i++)
            second[i] = new Student(in.nextInt());
        mergeSort(first, first.length);
        mergeSort(second, second.length);
        for (int i = 0 ; i < 10; i++){
            System.out.print(first[i].id + " ");
        }
        System.out.println();
        for (int i = 0 ; i < 10; i++){
            System.out.print(second[i].id + " ");
        }
        System.out.println();
        Student[] result = mergeOfTwo(first,second);
        for (int i = 0; i < 20; i++) {
            System.out.print(result[i].id + " ");
        }
    }
    public static void mergeSort(Student[] a, int n) {
        if (n < 2)
            return;
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }

    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].id <= r[j].id)
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        }
        while (i < left)
            a[k++] = l[i++];
        while (j < right)
            a[k++] = r[j++];
    }
    public static Student[] mergeOfTwo(Student[] one, Student[] two){
        Student[] whole = new Student[one.length + two.length];
        int i = 0, j = 0, iterator = 0;
        while (i != one.length - 1 && j != two.length - 1){
            if (one[i].id <= two[j].id) {
                whole[iterator] = one[i];
                iterator++;
                i++;
            }
            if (two[j].id <= one[i].id) {
                whole[iterator] = two[j];
                iterator++;
                j++;
            }
        }
        while (i != one.length) {
            whole[iterator] = one[i];
            i++;
            iterator++;
        }
        while (j != two.length){
            whole[iterator] = two[j];
            j++;
            iterator++;
        }
        return whole;
    }
}
