package Lavorare;

import ENUMS.Dipartimenti;

public class Dipendente {

    /*ATTRIBUTI*/
    private int matricola;
    private int stipendio;
    private Dipartimenti dipartimento;

    /*COSTRUTTI*/
    public Dipendente(int matricola, int stipendio, Dipartimenti dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public int getStipendio() {
        return stipendio;
    }

    public Dipartimenti getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimenti dipartimento) {
        this.dipartimento = dipartimento;
    }
}
