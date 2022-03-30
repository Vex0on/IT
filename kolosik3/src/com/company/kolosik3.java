package com.company;

import java.util.Scanner;

public class kolosik3 {

    public static void main(String[] args) {
        int []tab = stworz_tablice(6);
        wypisz_tablice(tab);
        System.out.println("Srednia wynosi = " + policz_srednia(tab));
        int []mniejsze = zwroc_wybrane(tab,policz_srednia(tab));
        wypisz_tablice(mniejsze);
    }

    public static int []stworz_tablice (int rozmiar) {

        Scanner skanik = new Scanner(System.in);
        int []tab = new int[rozmiar];
        for (int i = 0; i < rozmiar; i++)
        {
            tab[i] = skanik.nextInt()+10;
        }
        return tab;
    }

    public static void wypisz_tablice(int []tab) {
        for (int j : tab) {
            System.out.println(j);
        }

    }

    public static double policz_srednia(int []tab) {
        int suma = 0;
        double avg;
        for (int i=0; i<tab.length;i++)
        {
            suma += tab[i];
            if(tab.length == 0)
            {
                tab[i] = -1;
            }
        }
        avg = suma/tab.length;
        return avg;
    }

    public static int []zwroc_wybrane(int []tab, double avg) {
        int []tab1 = new int[tab.length];
        avg = policz_srednia(tab);
        for (int i=0; i<tab.length; i++)
        {
            if (avg > tab[i])
                tab1[i] = tab[i];
            if(tab.length == 0)
            {
                tab[i] = 0;
            }
        }
        return tab1;
    }

}
