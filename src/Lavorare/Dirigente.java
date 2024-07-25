package Lavorare;

import ENUMS.Dipartimenti;
import Interfaces.CheckIn;

import java.time.LocalDateTime;

public class Dirigente extends Dipendente implements CheckIn {
    /*ATTRIBUTI*/
    private int oreLavorate;


    /*COSTRUTTI*/
    public Dirigente(int matricola, int stipendio, Dipartimenti dipartimento) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = 40;
    }


    // METODI
    @Override
    public void calculateSalary() {
        System.out.println("Il tuo stipendio da Dirigente sarà di: " + getStipendio() + "$");

    }

    @Override
    public void checkIn() {
        System.out.println("La matricola: " + getMatricola() + " ha fatto il checkIn alle " + LocalDateTime.now());
    }
}
