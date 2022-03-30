package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Zad_3 {

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int size;
        //= Math.max(a.size(), b.size());
        if (a.size() > b.size())
            size = a.size();
        else
            size = b.size();

        for (int i = 0;i < size;i++) {
            if (i < a.size()) result.add(a.get(i));
            if (i < b.size()) result.add(b.get(i));
        }

        return result;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList <Integer> a, ArrayList <Integer> b)
    {
        ArrayList <Integer> c = merge(a, b);
        Collections.sort(c);

        return c;
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

        // Lista po mergeSorted
        ArrayList<Integer> array3 = mergeSorted(array1, array2);
        System.out.println("Lista 3: " + array3);
    }

}
