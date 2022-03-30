package pl.imiajd.Sosnowski;

import java.time.LocalDate;

public abstract class Osoba {

    private final String[] imie;
    private final LocalDate dataUrodzenia;
    private final boolean plec;

    public Osoba(String[]imie, LocalDate dataUrodzenia, boolean plec) {

        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }
    public String[] getImie() {return imie;}
    public LocalDate getDataUrodzenia() {return dataUrodzenia;}
    public boolean isPlec() {return plec;}

    @Override
    public String toString(){
        return "\n" +  "dataUrodzenia " + this.getDataUrodzenia() + "\n" + "plec: " + this.isPlec();
    }
}
