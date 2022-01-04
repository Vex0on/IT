package pl.imiajd.Sosnowski;

import java.time.LocalDate;

public class Pracownik extends Osoba {

    private LocalDate dataZatrudnienia;

    public Pracownik(String [] imie, LocalDate dataUrodzenia, boolean plec, LocalDate dataZatrudnienia){
        super(imie, dataUrodzenia, plec);
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public LocalDate getDataZatrudnienia() {return dataZatrudnienia;}
}
