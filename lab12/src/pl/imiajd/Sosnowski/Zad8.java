package pl.imiajd.Sosnowski;

import java.util.Iterator;
import java.util.LinkedList;

public class Zad8 {
    public static <T extends Iterable<?>> void print(T druczek ){
        Iterator obj = druczek.iterator();
        while(obj.hasNext()){
            System.out.print(obj.next() + ", ");
        }
    }

    public static void main(String[] args) {
        LinkedList<String> workers = new LinkedList<>();
        workers.add("Tomek");
        workers.add("Jacek");
        workers.add("Alicja");
        workers.add("Jędrek");
        workers.add("Zuzanna");
        print(workers);
    }
}
