package pl.imiajd.Sosnowski;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Osoba> grupaSt = new ArrayList<>(5);
        grupaSt.add(new Student("Szczepyk", LocalDate.of(1987, 9, 23), 3.6));
        grupaSt.add(new Student("Kowalski", LocalDate.of(1996, 4, 16), 2.39));
        grupaSt.add(new Student("Marsynowicz", LocalDate.of(2005, 6, 19), 4.75));
        grupaSt.add(new Student("Golep", LocalDate.of(1970, 11, 15), 5.0));
        grupaSt.add(new Student("Sosnowski", LocalDate.of(2001, 3, 31), 3.65));

        System.out.println(grupaSt);
        Collections.sort(grupaSt);
        System.out.println(grupaSt);

    }
}
