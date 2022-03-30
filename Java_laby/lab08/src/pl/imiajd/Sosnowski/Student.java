package pl.imiajd.Sosnowski;

import java.time.LocalDate;

public class Student extends Osoba{

    private double sredniaOcen;

    public Student(String [] imie, LocalDate dataUrodzenia, boolean plec, double sredniaOcen){
        super(imie, dataUrodzenia, plec);
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen() {return sredniaOcen;}
}
