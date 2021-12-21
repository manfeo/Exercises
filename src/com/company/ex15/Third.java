package com.company.ex15;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Third {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        try(FileWriter writer = new FileWriter("C:\\Users\\user\\IdeaProjects\\Exercises\\src\\com\\company\\FifteenExercise\\FileToWrite.txt")){
            writer.write(in.nextLine());
            writer.flush();
            writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
