package Lavorare;

import static ENUMS.Dipartimenti.*;

public class Main {
    public static void main(String[] args) {

        Dipendente dipendente1 = new Dipendente(123, 1000, PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(231, 1500, VENDITE);
        Dipendente dipendente3 = new Dipendente(321, 2000, AMMINISTRAZIONE);
        System.out.println(dipendente1.getMatricola());
        System.out.println(dipendente2.getMatricola());
        System.out.println(dipendente3.getMatricola());


    }
}