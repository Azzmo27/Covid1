package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler =  new FileHandler();
        ArrayList<Covid19Data> covid19DataList = fileHandler.loadAllData();
        System.out.println(covid19DataList);





    }
}