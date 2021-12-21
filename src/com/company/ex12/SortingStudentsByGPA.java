package com.company.ex12;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student one, Student two){
        if (one.id > two.id)
            return -1;
        else
            return 1;
    }
}
