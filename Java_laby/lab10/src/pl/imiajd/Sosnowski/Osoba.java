package pl.imiajd.Sosnowski;

import java.time.LocalDate;

public class Osoba implements Comparable<Osoba>, Cloneable {

    private final String nazwisko;
    private final LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia) {

        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + this.nazwisko + ", " + this.dataUrodzenia.toString() + "]";

    }

    @Override
    public boolean equals(Object obj) {
        Osoba os = (Osoba) obj;
        return (os.nazwisko.equals(this.nazwisko) && os.dataUrodzenia.equals(this.dataUrodzenia));
    }

    @Override
    public int compareTo(Osoba osa) {
        int cmp_nazwisko = this.nazwisko.compareTo(osa.nazwisko);
        if(cmp_nazwisko == 0) {
            return this.dataUrodzenia.compareTo(osa.dataUrodzenia);
        }
        return cmp_nazwisko;
    }
}
