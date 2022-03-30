package pl.imiajd.Sosnowski;

import java.time.LocalDate;
import java.util.ArrayList;

public class ZAD5 {
    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> tab) {
        for (int i = tab.size() - 1; i >= 0; i--) {
            int max = 0;
            for (int j = 0; j <= i; j++) {
                if (tab.get(max).compareTo(tab.get(j)) < 0) {
                    max = j;
                }
            }
            T temp;
            if (max != i) {
                temp = tab.get(i);
                tab.set(i, tab.get(max));
                tab.set(max, temp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<LocalDate> data = new ArrayList<>();
        data.add(LocalDate.of(1956, 5, 9));
        data.add(LocalDate.of(1956, 4, 9));
        data.add(LocalDate.of(1956, 5, 8));

        ArrayList<Integer> liczby = new ArrayList<>();
        liczby.add(9);
        liczby.add(2);
        liczby.add(5);
        liczby.add(6);
        selectionSort(data);
        selectionSort(liczby);
        System.out.println("Daty: " + data);
        System.out.println("Liczby: " + liczby + "\n");
    }
}
