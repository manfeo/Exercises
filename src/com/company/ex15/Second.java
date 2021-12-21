package com.company.ex15;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Second {
    public static void main(String[] args){

        try(FileReader fileReader = new FileReader("C:\\Users\\user\\IdeaProjects\\Exercises\\src\\com\\company\\FifteenExercise\\FileToWrite.txt")){
            Scanner in = new Scanner(fileReader);
            System.out.println(in.nextLine());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
