package com.company;

import java.util.ArrayList;

public class Zad_4 {

    public static ArrayList <Integer> reversed(ArrayList <Integer> a)
    {
        for(int i = 0, j = a.size() - 1; i < j; i++) {
            a.add(i, a.remove(j));
        }
        return a;
    }

    public static void main(String[] args) {

        // Lista 1
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(4);
        array1.add(9);
        array1.add(16);
        System.out.println("Lista 1: " + array1);

        // Lista 2
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(9);
        array2.add(7);
        array2.add(4);
        array2.add(9);
        array2.add(11);
        System.out.println("Lista 2: " + array2);

        // Lista po reversed
        ArrayList<Integer> array3 = reversed(array2);
        System.out.println("Lista 3: " + array3);
    }

}
