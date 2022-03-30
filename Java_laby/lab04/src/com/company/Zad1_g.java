package com.company;

import java.util.Scanner;

public class Zad1_g {

    public static String nice (String str) {
    StringBuilder buff = new StringBuilder();
    int przerwa = 1;
    for (int i=str.length()-1; i>=0; i--)
    {
        buff.append(str.charAt(i));
        if (przerwa==3)
        {
            buff.append("'");
            przerwa = 0;
        }
        przerwa++;
    }
    buff.reverse();
    return buff.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dowolny napis: ");
        String str = scan.next();
        System.out.println(nice(str));
    }
}
