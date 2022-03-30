package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zad1_g {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Podaj n z zakresu <1:100>: ");
        int n = scan.nextInt();
        if (n < 1 || n > 100)
            System.out.println("Podałeś nieprawidłową liczbę, wróc do instrukcji!");
        int[] x = new int[n];
        for (int j = 0; j < n; j++)
        {
            int wynik = rand.nextInt(1998) - 999;
            x[j] = wynik;
        }
        int lewy = scan.nextInt();
        int prawy = scan.nextInt();
        int l = x[lewy];
        int p= x[prawy];
        x[lewy] = p;
        x[prawy] = l;

        for(int sezam : x)
        {
            System.out.print(sezam + ", ");
        }
    }
}