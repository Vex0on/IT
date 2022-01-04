package pl.imiajd.Sosnowski;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Flet("Jupiter", LocalDate.of(1998, 3, 31)));
        orkiestra.add(new Fortepian("Bluthner", LocalDate.of(1969, 10, 4)));
        orkiestra.add(new Skrzypce("Yamaha", LocalDate.of(1775, 6, 19)));
        orkiestra.add(new Flet("Ellise", LocalDate.of(2003, 11, 15)));
        orkiestra.add(new Skrzypce("Ars Nova", LocalDate.of(1988, 5, 13)));
        for (Instrument instru : orkiestra){
        System.out.print("\n" +  instru.dzwiek() + " ");
            System.out.println(instru);
        }
    }
}