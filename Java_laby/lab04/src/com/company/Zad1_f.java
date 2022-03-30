package com.company;

import java.util.Scanner;

public class Zad1_f {

    public static String change(String str) {
        StringBuffer buff = new StringBuffer();
        for (int i=0; i<str.length(); i++)
        {
            if (Character.isUpperCase(str.charAt(i)))
            {
                buff.append(String.valueOf(str.charAt(i)).toLowerCase());
            }
            else
            {
                buff.append(String.valueOf(str.charAt(i)).toUpperCase());
            }
        }
        return buff.toString();
    }

    public static void main(String[] args) {
        System.out.println("Podaj dowolne slowo: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("> " + change(str));
    }
}
