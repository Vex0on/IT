package com.company;

import java.util.Scanner;

public class Zad1_a {

    public static int countChar(String str, char c) {
        int suma = 0;
        for (int i=0;i<str.length();i++){
            char c1 = str.charAt(i);
            if (c1 == c)
                suma++;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Podaj dowolne slowo: ");
        System.out.print("> ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Podaj litere, ktorej ilosc wystapien chcesz policzyc: ");
        System.out.print("> ");
        char c = scan.next().charAt(0);
        System.out.println("Liczba powtórzeń znaku " + c + " wynosi: " + countChar(str, c));
    }
}
