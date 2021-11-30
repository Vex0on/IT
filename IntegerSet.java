package com.company;
import java.util.Arrays;

public class IntegerSet {
    private boolean[] zad2;

    public IntegerSet() {
        zad2 = new boolean[100];
    }

    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet wynik = new IntegerSet();
        for (int i = 0; i < 100; i++) {
            if (set1.zad2[i] == true || set2.zad2[i] == true) {
                wynik.zad2[i] = true;
            }
        }
        return wynik;
    }

    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet wynik = new IntegerSet();
        for (int i = 0; i < 100; i++) {
            if (set1.zad2[i] == true && set2.zad2[i] == true) {
                wynik.zad2[i] = true;
            }
        }
        return wynik;
    }

    public void insertElement(int k) {
        zad2[k - 1] = true;
    }

    public void deleteElement(int k) {
        zad2[k - 1] = false;
    }

    public void print() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + 1 + " " + zad2[i]);
        }
    }

    @Override
    public String toString() {
        var wynik = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            if (zad2[i] == true)
                wynik.append(i+1 + " ");
        }
        return wynik.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerSet that = (IntegerSet) o;
        return Arrays.equals(zad2, that.zad2);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(zad2);
    }

}