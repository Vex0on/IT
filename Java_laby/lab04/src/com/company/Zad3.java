package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args)
    {
        int strCount = 0;
        try
        {
            File file = new File("Zad2.txt");
            Scanner czytnik = new Scanner(file);
            Scanner scan = new Scanner(System.in);
            System.out.print("Podaj szukane slowo: ");
            String word = scan.next();
            System.out.println();

            while (czytnik.hasNext())
            {
                String iseQual = czytnik.next();
                if(iseQual.equals(word))
                {
                    strCount++;
                }
            }
            czytnik.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Nie mozna odnalezc okreslonego pliku");
        }
        System.out.print("Ilosc wystapien = " + strCount);
    }
}