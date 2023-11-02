package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File("Covid19NøgleTal.csv");


    public ArrayList<Covid19Data> loadAllData() {
        Scanner fileScanner = null;
        ArrayList<Covid19Data> covid19DataList = new ArrayList<>();
        try {
            fileScanner = new Scanner(file);
            fileScanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Covid19Data covid19Data1 = null;
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] attributes = line.split(";");
            covid19Data1 = new Covid19Data(
                    attributes[0], //region
                    attributes[1], // aldersGruppe
                    (Integer.parseInt(attributes[2])), // bekræfteAntalTilfælde
                    (Integer.parseInt(attributes[3])), //døde
                    (Integer.parseInt(attributes[4])),
                    (Integer.parseInt(attributes[5]))

            );
            covid19DataList.add(covid19Data1);


        }
        fileScanner.close();
        return covid19DataList;
    }
}

