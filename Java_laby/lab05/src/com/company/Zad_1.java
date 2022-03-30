package com.company;

import java.util.ArrayList;

public class Zad_1 {

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        c.addAll(a);
        c.addAll(b);
        return c;
    }

    public static void main(String[] args) {

        // Lista 1
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        array1.add(1);
        array1.add(4);
        array1.add(9);
        array1.add(16);
        System.out.println("Lista 1: " + array1);

        // Lista 2
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(9);
        array2.add(7);
        array2.add(4);
        array2.add(9);
        array2.add(11);
        System.out.println("Lista 2: " + array2);

        // Lista po append
        ArrayList<Integer> array3 = append(array1, array2);
        System.out.println("Lista 3: " + array3);
    }
}