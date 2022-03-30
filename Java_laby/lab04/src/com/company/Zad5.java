package com.company;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Ile wynosi Twój aktualny kapitał: ");
        BigDecimal k = scan.nextBigDecimal();
        System.out.print("Ile wynosi oprocentowanie: ");
        double p = scan.nextDouble() / 100;
        System.out.print("Po jakim okresie chcesz policzyć swój kapitał? (w latach): ");
        int n = scan.nextInt();

        BigDecimal liczonko = new BigDecimal(p);

        for(int i = 0; i < n; i++)
        {
            k = k.add(k.multiply(liczonko));
        }

        System.out.print("Nowy kapitał wynosi = " + k.setScale(2, RoundingMode.HALF_EVEN));


    }
}