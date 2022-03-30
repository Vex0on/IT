package com.company;

import java.io.*;
import java.util.Scanner;

public class Zad2
{

    public static void main(String[] args)
    {
        int charCount = 0;
        try
        {
            File file = new File("Zad2.txt");
            Scanner czytnik = new Scanner(file);
            Scanner scan = new Scanner(System.in);
            System.out.print("Podaj szukany znak: ");
            char character = scan.next().charAt(0);
            System.out.println();

            while (czytnik.hasNext())
            {
                String inside = czytnik.nextLine();
                for(int i=0; i<inside.length(); i++)
                {
                    if(inside.charAt(i) == character)
                    {
                        charCount++;
                    }
                }
            }
            czytnik.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Nie mozna odnalezc okreslonego pliku");
        }
        System.out.print("Ilosc znaku wynosi = " + charCount);
    }
}