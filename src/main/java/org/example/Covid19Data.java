package org.example;

import java.util.ArrayList;

public class Covid19Data {
    private String region;
    private String aldersGruppe;
    private int bekræfteAntalTilfælde;
    private int døde;
    private int IndlagtePåintensiv;
    private int indlagte;



    Covid19Data(String region, String aldersGruppe, int bekræfteAntalTilfælde, int døde, int indlagtePåIntensiv, int indlagte) {
        this.region = region;
        this.aldersGruppe = aldersGruppe;
        this.bekræfteAntalTilfælde = bekræfteAntalTilfælde;
        this.døde = døde;
        this.IndlagtePåintensiv = indlagtePåIntensiv;
        this.indlagte = indlagte;

    }


    @Override
    public String toString() {
        return "\n" + "Covid-19 Data tal =" +
                "region ='" + region + '\'' +
                ", Alders grupper='" + aldersGruppe + '\'' +
                ", bekræfte antal tilfælde=" + bekræfteAntalTilfælde +
                ", døde=" + døde +
                ", Indlagte på intensiv=" + IndlagtePåintensiv +
                ", indlagte=" + indlagte
                ;
    }


    }
