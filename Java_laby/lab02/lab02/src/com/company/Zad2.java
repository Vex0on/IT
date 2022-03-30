package com.company;

import java.util.Random;
import java.util.Scanner;

public class Zad2 {

    public static void generuj (int []tab, int n, int minWartosc, int maxWartosc) {
        Random r = new Random();
        for (int j = 0; j < n; j++) {
            tab[j] = r.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
        }
    }

    public static void wypisz(int []tab)
    {
        for (int i : tab) {
            System.out.print(i + ", ");
        }
    }

    public static int ileNieparzystych (int []tab)
    {
        int start = 0;
        for (int j : tab)
            if (j % 2 == 1 || j % 2 == -1)
                start += 1;

        return start;
    }

    public static int ileParzystych (int []tab)
    {
        int start = 0;
        for (int j: tab)
            if (j % 2 == 0)
                start +=1;
        return start;
    }

    public static int ileDodatnich(int []tab)
    {
        int start = 0;
        for (int j:tab)
            if (j > 0)
                start += 1;
        return start;
    }

    public static int ileUjemnych(int []tab)
    {
        int start = 0;
        for (int j:tab)
            if (j < 0)
                start += 1;
        return start;
    }

    public static int ileZerowych(int []tab)
    {
        int start = 0;
        for (int j:tab)
            if (j == 0)
                start += 1;
        return start;
    }

    public static int ileMaksymalnych(int []tab)
    {
        int max = tab[0];
        int start = 0;
        for (int j:tab)
            if (max < j)
                max = j;
        for(int j:tab)
            if (max == j)
                start += 1;
        return start;
    }

    public static int sumaDodatnich(int []tab)
    {
        int start = 0;
        for (int j:tab)
            if (j > 0)
                start += j;
        return start;
    }

    public static int sumaUjemnych(int []tab)
    {
        int start = 0;
        for (int j:tab)
            if (j < 0)
                start += j;
        return start;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich(int []tab)
    {
        int sezam = 0;
        int start = 0;
        for (int j : tab) {
            if (j > 0) {
                sezam += 1;
            } else {
                if (sezam > start) {
                    start = sezam;
                }
                sezam = 0;
            }
        }
        return start;
    }

    public static void signum(int []tab)
    {
        for (int j = 0; j < tab.length; j++)
            if (tab[j] > 0)
                tab[j] = 1;
            else if (tab[j] < 0)
                tab[j] = -1;
            for (int w:tab)
                System.out.print(w + ", ");
    }

    public static void odwrocFragment (int []tab, int lewy, int prawy)
    {
        for(int i = 0; i < tab.length; i++){
            int l = tab[lewy];
            int p = tab[prawy];
            tab[lewy] = p;
            tab[prawy] = l;
            }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj wartość n: ");
        int n = scan.nextInt();
        int[] x = new int[n];
        generuj(x, n, -999, 999);
        wypisz(x);
        System.out.println();

        int npr = ileNieparzystych(x);
        int pr = ileParzystych(x);
        int dod = ileDodatnich(x);
        int uj = ileUjemnych(x);
        int zr = ileZerowych(x);
        int max = ileMaksymalnych(x);
        int sd = sumaDodatnich(x);
        int su = sumaUjemnych(x);
        int dmcd = dlugoscMaksymalnegoCiaguDodatnich(x);


            System.out.println("Ilość liczb nieparzystych wynosi= " + npr);
            System.out.println("Ilość liczb parzystych wynosi = " + pr);
            System.out.println("Ilość liczb dodatnich wynosi = " + dod);
            System.out.println("Ilość liczb ujemnych wynosi = " + uj);
            System.out.println("Ilość liczb zerowych wynosi = " + zr);
            System.out.println("Ilość liczb maksymalnych wynosi = " + max);
            System.out.println("Suma liczb dodatnich wynosi = " + sd);
            System.out.println("Suma liczb ujemnych wynosi = " + su);
            System.out.println("Długość maksymalnego ciągu dodatnich wynosi = " + dmcd);
            System.out.print("Signum = " );
            signum(x);
            System.out.println();
            wypisz(x);
            System.out.println();
            System.out.println("Po odwroceniu: ");
            odwrocFragment(x, 0 ,4); //Dla 5 elementow
            wypisz(x);


    }
}
