package Lavorare;

import Interfaces.CheckIn;

import static ENUMS.Dipartimenti.*;

public class Main {
    public static void main(String[] args) {

       /*
        Dipendente dipendente1 = new Dipendente(123, 1000, PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(231, 1500, VENDITE);
         Dipendente dipendente3 = new Dipendente(321, 2000, AMMINISTRAZIONE);
        System.out.println(dipendente1.getMatricola());
        System.out.println(dipendente2.getMatricola());
        System.out.println(dipendente3.getMatricola());
       */
        DipendenteFullTime Diego = new DipendenteFullTime(112, 1800, PRODUZIONE);
        Dirigente Eddy = new Dirigente(200, 3200, AMMINISTRAZIONE);
        DipendentePartTime Arianna = new DipendentePartTime(118, 1800, VENDITE, 20);


        Dipendente[] dipendentiEpici = {Diego, Eddy, Arianna};
        for (int i = 0; i < dipendentiEpici.length; i++) {
            System.out.println("Matricola: " + dipendentiEpici[i].getMatricola());
            dipendentiEpici[i].calculateSalary();
        }

        Volontario Kassandra = new Volontario("Kassandra", 24, "sta un passo avanti sul Backend!");
        CheckIn[] checkIns = {Diego, Eddy, Arianna, Kassandra};
        for (int i = 0; i < checkIns.length; i++) {
            checkIns[i].checkIn();
            
        }
    }
}