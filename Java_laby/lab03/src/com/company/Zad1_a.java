package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zad1_a {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Podaj n z zakresu <1:100>: ");
        int n = scan.nextInt();
        if(n<1 || n>100)
        {
            System.out.println("Podałeś nieprawidłową liczbę, wróc do instrukcji!");
        }
        int start = 0;
        int sezam = 0;
        int[] x = new int[n];
        for (int j=0; j<n;j++) {
            int wynik = rand.nextInt(1998)-999;
            x[j] = wynik;
            if (wynik % 2 == 0)
                sezam += 1;
            else if (wynik % 2 == 1 || wynik % 2 == -1)
                start += 1;
        }
        System.out.println("Liczby: " + Arrays.toString(x));
        System.out.println("Ilość liczb nieparzystych wynosi:" + start);
        System.out.println("Ilość liczb parzystych wynosi: " + sezam);
    }
}