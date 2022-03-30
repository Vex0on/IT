package com.company;

import java.util.ArrayList;

public class Zad_5 {

    public static void reverse(ArrayList <Integer> a)
    {
        System.out.print("[");
        for(int i = a.size() - 1;i >= 0;i--)
            System.out.print(a.get(i) + ", ");
        System.out.print("]");
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

        // Lista po reverse
        System.out.print("Lista 2 po odwroceniu: ");
        reverse(array1);
    }
}