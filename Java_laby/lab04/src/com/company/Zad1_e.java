package com.company;

import java.util.Scanner;

public class Zad1_e {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dowolny ciag slow: ");
        System.out.print("> ");
        String str = scan.nextLine();
        System.out.println("Podaj szukane slowo: ");
        System.out.print("> ");
        String subStr = scan.nextLine();
        int[] x = where(str, subStr);
        for (int idx : x)
            System.out.print(idx + ", ");
    }

    public static int[] where(String str, String subStr) {

        int[] idx = new int[countSubStr(str, subStr)];
        int miejsce = 0;
        int x = 0;
        while (true) {
            if (str.indexOf(subStr, x) != -1) {
                idx[miejsce] = str.indexOf(subStr, x);
                x = str.indexOf(subStr, x) + 1;
                miejsce++;
            } else {
                break;
            }
        }
        return idx;
    }

    public static int countSubStr(String str, String subStr) {
        int suma = 0;
        int lI = 0;
        while (lI != -1) {
            lI = str.indexOf(subStr, lI);
            if (lI != -1) {
                suma++;
                lI += subStr.length();
            }
        }
        return suma;
    }
}
