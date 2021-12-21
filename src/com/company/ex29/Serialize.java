package com.company.ex29;

import java.io.*;

public class Serialize {


    public static void main(String[] args) throws IOException {
        CurrencyInfo currencyInfo = new CurrencyInfo(22,23,34);
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\user\\Desktop\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(currencyInfo);
        objectOutputStream.close();
    }
}
