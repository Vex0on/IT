package pl.imiajd.Sosnowski;

import java.time.LocalDate;
import java.util.Arrays;

public class TestOsoba {
    public static void main(String[] args) {
        Osoba[] wypisywanie = new Osoba[4];
        wypisywanie[0] = new Student(new String[]{"Jan"}, LocalDate.of(2000, 2, 25), true, 4.25);
        wypisywanie[2] = new Pracownik(new String[]{"Leszek"}, LocalDate.of(1984, 7, 17), false, LocalDate.of(2007, 7, 13));
        wypisywanie[1] = new Student(new String[]{"Basia"}, LocalDate.of(2001, 4, 13), true, 4.25);
        wypisywanie[3] = new Pracownik(new String[]{"Andrzej"}, LocalDate.of(1979, 11, 4), false, LocalDate.of(2000, 10, 1));

        Arrays.stream(wypisywanie).forEachOrdered(o -> {
            for (String i : o.getImie()) {
                System.out.print(i + " ");
            }
            System.out.print("\n" + "-> Urodzony w: " + o.getDataUrodzenia() + "\n");
            if (o.isPlec()) {
                //No wie Pan, nie można wszystkim dogodzić to trzeba było jednak wybrać jedną z opcji.
                System.out.println("-> Mężczyzna");
            } else {
                System.out.println("-> Kobieta");
            }
            System.out.println();
        });
    }
}