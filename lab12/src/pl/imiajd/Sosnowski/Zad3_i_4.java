package pl.imiajd.Sosnowski;

import java.util.LinkedList;

// Zad 3 i 4

public class Zad3_i_4 {
    public static <T> void odwroc(LinkedList<T> lista) {
        LinkedList<T> tmp = new LinkedList<>(lista);
        for (int i = lista.size() - 1, j = 0; i >= 0; i--, j++) {
            lista.set(j, tmp.get(i));
        }
    }

    public static void main(String[] args) {
        LinkedList<String>workers=new LinkedList<>();
        workers.add("Tomek");
        workers.add("Jacek");
        workers.add("Alicja");
        workers.add("Jędrek");
        workers.add("Zuzanna");
        System.out.println(workers);
        odwroc(workers);
        System.out.println(workers);
    }
}
