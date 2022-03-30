package com.company;

import java.util.Scanner;

public class Zad1_b {

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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dowolne slowo: ");
        System.out.print("> ");
        String str = scan.nextLine();
        System.out.println("Podaj slowo, ktorego szukasz: ");
        System.out.print("> ");
        String subStr = scan.nextLine();
        System.out.println("Liczba powtórzeń slowa " + subStr + " wynosi: " + countSubStr(str, subStr));
    }
}
