package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Zad4 {

    public static void wypisz(BigInteger [][]tab, int x)
    {
        for(int i=0; i<x; i++)
        {
            for(int j=0; j<x; j++)
            {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger("1");
        BigInteger counter = new BigInteger("0");
        System.out.print("Podaj dowolne wymiary tablicy (n × n): ");
        int wymiar = sc.nextInt();

        BigInteger [][]szachownica = new BigInteger[wymiar][wymiar];
        for(int i=0; i<wymiar; i++)
            for(int j=0; j<wymiar; j++)
            {
                szachownica[i][j] = n;
                counter = counter.add(n);
                n = n.multiply(new BigInteger("2"));
            }
        wypisz(szachownica, wymiar);
        System.out.println();
        System.out.println("Suma ziarna : " + counter);
    }
}