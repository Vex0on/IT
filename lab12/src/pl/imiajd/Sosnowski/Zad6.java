package pl.imiajd.Sosnowski;

import java.util.LinkedList;
import java.util.Stack;

public class Zad6 {
    public static void liczby(int liczba){
        Stack<Integer> liczby = new Stack<>();
        while(liczba!=0){
            liczby.push(liczba%10);
            liczba/=10;
        }
        while(liczby.size()>0){
            System.out.println(liczby.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<Integer> liczby = new LinkedList<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(3);
        liczby.add(4);
        Zad8.print(liczby);
        System.out.println();
        System.out.println();
        liczby(2015);
    }
}
