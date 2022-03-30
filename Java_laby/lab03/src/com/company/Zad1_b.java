package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zad1_b {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Podaj n z zakresu <1:100>: ");
        int n = scan.nextInt();
        if(n<1 || n>100)
        {
            System.out.println("Podałeś nieprawidłową liczbę, wróc do instrukcji!");
        }
        int dod = 0;
        int uj = 0;
        int zero = 0;
        int[] x = new int[n];
        for (int j = 0; j < n; j++) {
            int wynik = rand.nextInt(1998)-999;
            x[j] = wynik;
            if (wynik > 0)
                dod += 1;
            else if (wynik < 0)
                uj += 1;
            else
                zero += 1;
        }
        System.out.println("Liczby: " + Arrays.toString(x));
        System.out.println("Ilość liczb dodatnich wynosi: " + dod);
        System.out.println("Ilość liczb ujemnych wynosi:" + uj);
        System.out.println("Ilość liczb zerowych wynosi: " + zero);

    }
}