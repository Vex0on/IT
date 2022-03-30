package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zad1_c {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Podaj n z zakresu <1:100>: ");
        int n = scan.nextInt();
        if (n < 1 || n > 100) {
            System.out.println("Podałeś nieprawidłową liczbę, wróc do instrukcji!");
        }
        int wynik2 = 0;
        int start = 0;
        int[] x = new int[n];
        for (int j=0;j<n;j++) {
            int wynik = rand.nextInt(1998) - 999;
            x[j] = wynik;
        }
        for (int j=1;j<n;j++) {
            wynik2 = x[0];
            if (x[j] > wynik2)
                wynik2 = x[j];
        }
        for (int sezam : x) {
            if (wynik2 == sezam)
                start += 1;
        }
        System.out.println("Liczby: " + Arrays.toString(x));
        System.out.println("Ilość liczb maksymalnych wynosi:" + start);
    }
}