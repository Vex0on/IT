package com.company;
import java.util.Arrays;

public class IntegerSet {
    private boolean[] zad2;

    public IntegerSet() {
        zad2 = new boolean[100];
    }

    public void deleteElement(int k) {
        zad2[k-1] = false;
    }

    public void insertElement(int k) {
        zad2[k-1] = true;
    }

    public static IntegerSet intersection(IntegerSet zbior1, IntegerSet zbior2) {
        IntegerSet res = new IntegerSet();
        for (int i=0; i<100; i++) {
            if (zbior1.zad2[i] == true && zbior2.zad2[i] == true) {
                res.zad2[i] = true;
            }
        }
        return res;
    }

    public static IntegerSet union(IntegerSet zbior1, IntegerSet zbior2) {
        IntegerSet res = new IntegerSet();
        for (int i=0; i<100; i++) {
            if (zbior1.zad2[i] == true || zbior2.zad2[i] == true) {
                res.zad2[i] = true;
            }
        }
        return res;
    }


}