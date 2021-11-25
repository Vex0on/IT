package com.company;

import java.util.Random;

public class kolos {

    public static void main(String[] args) {
    double[] tab = stworz_tablice();
    wypisz_tablice(tab, 10);
    double max = wyznacz_maksimum(tab, 10);
    System.out.println("Maksimum wynosi: " + max);
    double[] mniejsze = zwroc_mniejsze(tab, 10);
    wypisz_tablice(mniejsze, 10);
    double avg = policz_srednia(tab, 10);
    System.out.println("Srednia wynosi: " + avg);
    double[] srednie = zwroc_mniejsza(tab, 10);
    wypisz_tablice(srednie, 10);
    double min = wyznacz_przed_minimum(tab, 10);
    System.out.println("Minimum wynosi: " + min);

    }

    public static double []stworz_tablice () {

        Random rand = new Random();
        double[] tab = new double[10];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i<10;  i++)
        {
            tab[i] = -1 + (rand.nextDouble(4+1));
        }
        return tab;
    }

    public static void wypisz_tablice (double []tab, int rozmiar) {

        for (int i = 0; i < rozmiar; i++)
        {
            System.out.println(tab[i]);
        }
    }

    public static double wyznacz_maksimum (double []tab, int rozmiar) {
        double max = tab[0];
        for (int i = 0; i < rozmiar; i++)
        {
            if (max < tab[i])
            {
                max = tab[i];
            }
        }
        return max;
    }

    public static double []zwroc_mniejsze(double[] tab, int rozmiar) {
        double[] tab1 = new double[rozmiar];
        for (int i = 0; i < rozmiar; i++) {
            if(wyznacz_maksimum(tab,rozmiar)>tab[i])
            {
                tab1[i] = tab[i];
            }
        }
        return tab1;
    }

    public static double policz_srednia(double[] tab, int rozmiar) {
        double suma = 0;
        for (int i = 0; i < rozmiar; i++)
        {
            suma += tab[i];
        }
        return suma / rozmiar;
    }

    public static double []zwroc_mniejsza(double[] tab, int rozmiar) {
        double[] tab1 = new double[rozmiar];
        for (int i = 0; i < rozmiar; i++) {
            if(policz_srednia(tab,rozmiar)>tab[i])
            {
                tab1[i] = tab[i];
            }
        }
        return tab1;
    }

    public static double wyznacz_przed_minimum (double []tab, int rozmiar) {
        double min = tab[0];
        for (int i = 0; i < rozmiar; i++)
        {
            if (min > tab[i])
            {
                min = tab[i-1];
            }
        }
        return min;
    }
}
