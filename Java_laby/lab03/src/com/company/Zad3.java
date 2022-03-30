package com.company;

import java.util.Scanner;
import java.util.Random;

public class Zad3 {

        public static void mnozenieMacierzy(int[][] tab1, int[][] tab2, int[][] tab3)
        {
            int x = 0;
            for(int i=0; i<tab1.length; i++)
            {
                for(int j=0; j<tab2[0].length; j++)
                {
                    for(int k=0; k<tab2.length; k++)
                    {
                        tab3[i][x] += tab1[j][k] * tab2[k][j];
                    }
                    x++;
                }
                x = 0;
            }
        }

    public static void generuj(int[][] tab)
    {
        Random rand = new Random();
        for(int j=0; j<tab.length; j++)
        {
            for(int i=0; i<tab[j].length; i++)
            {
                tab[j][i] = rand.nextInt(10 - 1 + 1) + 1;
            }
        }
    }

    public static void wypisz(int [][]tab) {
        for (int[] ints : tab) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Podaj liczbę m: ");
        int m = scan.nextInt();
        System.out.println("Podaj liczbę n: ");
        int n = scan.nextInt();
        System.out.println("Podaj liczbę k: ");
        int k = scan.nextInt();
        int[][] macierzA = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                macierzA[i][j] = rand.nextInt(10);
        int[][] macierzB = new int[n][k];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < k; j++)
                macierzB[i][j] = rand.nextInt(10);
        int[][] macierzC = new int[m][k];

        //Wyświetlenie macierzy
        generuj(macierzA);
        wypisz(macierzA);
        generuj(macierzB);
        System.out.println();
        wypisz(macierzB);
        mnozenieMacierzy(macierzA, macierzB, macierzC);
        System.out.println();
        wypisz(macierzC);
    }
}