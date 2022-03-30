package pl.imiajd.Sosnowski;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<>(5);
        grupa.add(new Osoba("Szczepyk", LocalDate.of(1987, 9, 23)));
        grupa.add(new Osoba("Kowalski", LocalDate.of(1996, 4, 16)));
        grupa.add(new Osoba("Marsynowicz", LocalDate.of(2005, 6, 19)));
        grupa.add(new Osoba("Golep", LocalDate.of(1970, 11, 15)));
        grupa.add(new Osoba("Sosnowski", LocalDate.of(2001, 3, 31)));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}