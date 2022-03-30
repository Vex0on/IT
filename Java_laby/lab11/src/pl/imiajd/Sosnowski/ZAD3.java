package pl.imiajd.Sosnowski;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class ZAD3 {
    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> tab) {
        ArrayList<T> temp = new ArrayList<>(tab);
        Collections.sort(temp);
        return tab.equals(temp);
    }

    public static void main(String[] args) {
        ArrayList<LocalDate> data = new ArrayList<>();
        data.add(LocalDate.of(1956, 5, 9));
        data.add(LocalDate.of(1956, 4, 9));
        data.add(LocalDate.of(1956, 5, 8));
        System.out.println(isSorted(data));
        Collections.sort(data);
        System.out.println("Daty po posortowaniu: " + data);
        System.out.println(isSorted(data));

        ArrayList<Integer> liczby = new ArrayList<>();
        liczby.add(9);
        liczby.add(2);
        liczby.add(5);
        liczby.add(6);
        System.out.println(isSorted(liczby));
        Collections.sort(liczby);
        System.out.println("Liczby po posortowaniu: " + liczby);
        System.out.println(isSorted(liczby));

    }
}