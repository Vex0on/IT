package pl.imiajd.Sosnowski;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class plik {
    public static void main(String[] args) throws FileNotFoundException {
            ArrayList<String> zad3 = new ArrayList<>();
            File file = new File("zad3.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                zad3.add(scanner.nextLine() + "\n");
            }
            scanner.close();

            System.out.println(zad3);
            Collections.sort(zad3);
            System.out.println(zad3);
    }
}
