package com.company;

import java.util.Scanner;

public class Zad1_d {

    public static String repeat (String str, int n){
    String ilosc = null;
    for (int i=0; i<n;i++)
        ilosc = str.repeat(n);
    return ilosc;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dowolne slowo: ");
        System.out.print("> ");
        String str = scan.nextLine();
        System.out.println("Podaj ilosc powtorzen: ");
        System.out.print("> ");
        int n = scan.nextInt();
        System.out.println(repeat(str, n));
    }

}
