package Lavorare;

import ENUMS.Dipartimenti;
import Interfaces.CheckIn;

import java.time.LocalDateTime;

public class DipendentePartTime extends Dipendente implements CheckIn {

    /*ATTRIBUTI*/
    private int oreLavorate;


    /*COSTRUTTI*/
    public DipendentePartTime(int matricola, int stipendio, Dipartimenti dipartimento, int oreLavorate) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = oreLavorate;
    }


    // METODI
    @Override
    public void calculateSalary() {
        System.out.println("Il tuo stipendio Dipendente partTime sarà di: " + (getStipendio() / 40) * oreLavorate + "$");
    }

    @Override
    public void checkIn() {
        System.out.println("La matricola: " + getMatricola() + " ha fatto il checkIn alle " + LocalDateTime.now());
    }
}
