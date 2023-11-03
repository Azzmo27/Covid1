package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler =  new FileHandler();
        ArrayList<Covid19Data> covid19DataList = fileHandler.loadAllData();
        System.out.println(covid19DataList);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Vælg en mulighed:");
            System.out.println("1. Sorter efter Region");
            System.out.println("2. Sorter efter Aldersgruppe");
            System.out.println("3. Afslut");

            int valg = scanner.nextInt();

            switch (valg) {
                case 1:
                    Collections.sort(covid19DataList, new RegionComparator());
                    visCovid19Data(covid19DataList);
                    break;
                case 2:
                    Collections.sort(covid19DataList, new AldersGruppeComparator());
                    visCovid19Data(covid19DataList);
                    break;
                case 3:
                    System.out.println("Programmet afsluttes.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Ugyldigt valg. Vælg venligst en gyldig mulighed.");
                    break;
            }
        }
    }

    private static void visCovid19Data(ArrayList<Covid19Data> data) {
        for (Covid19Data item : data) {
            System.out.println(item);
        }
    }
}
