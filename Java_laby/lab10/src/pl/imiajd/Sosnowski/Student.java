package pl.imiajd.Sosnowski;

import java.time.LocalDate;

public class Student extends Osoba implements Comparable<Osoba>, Cloneable {

    private final double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "["+this.getNazwisko() + ", "+this.getDataUrodzenia().toString() + ", " + this.sredniaOcen + "]";
    }

    @Override
    public int compareTo(Osoba os) {
        int ostatni = super.compareTo((os));
        if((os instanceof Student) && (ostatni == 0)){
            return -(int)Math.ceil(this.sredniaOcen - ((Student) os).sredniaOcen);
        }
        return ostatni;
    }
}
