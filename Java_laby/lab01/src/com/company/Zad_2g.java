package com.company;

import java.util.Scanner;

public class Zad_2g {

    public static void main(String[] args) {
        System.out.println("Zadanie 2 g) ");
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
            if (a % 2 == 1 && a > 0){
                wynik += 1;
            }
            System.out.println("Wsród podanych liczb jest " + wynik + " liczb, które są nieparzyste i nieujemne");
        }
    }
}
