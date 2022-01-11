package pl.imiajd.Sosnowski;

import java.util.LinkedList;

//Zadanie 1 i 2

public class Zad1_i_2 {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n) {
        int tmp = n - 1;
        for (int i = tmp; i < pracownicy.size(); i += tmp) {
            pracownicy.remove(i);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> workers = new LinkedList<>();
        workers.add("Tomek");
        workers.add("Jacek");
        workers.add("Alicja");
        workers.add("Jędrek");
        workers.add("Zuzanna");
        System.out.println(workers);
        redukuj(workers,2);
        System.out.println(workers);
    }
}
