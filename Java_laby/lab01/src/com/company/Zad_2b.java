package com.company;

import java.util.Scanner;

public class Zad_2b {

    public static void main(String[] args) {
        System.out.println("Zadanie 2 b) ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilosc liczb: ");
        int n = scan.nextInt();
        int wynik = 0;

        for (int i=0;i<n;i++)
        {
            System.out.println("Podaj liczbe naturalna: ");
            int a = scan.nextInt();

            if (a < 0)
            {
                System.out.println("Podana liczba nie jest naturalna, włącz program jeszcze raz i przeczytaj instrukcje");
                break;
            }
            if (a % 3 == 0 && a % 5 != 0){
                wynik += 1;
            }
            System.out.println("Wsród podanych liczb jest " + wynik + " podzielnych przez 3 i niepodzielnych przez 5");
        }
    }
}
