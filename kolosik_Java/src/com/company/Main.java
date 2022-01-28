package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static int[] stworzTablice(){
        Random rand = new Random();
        int rozmiar = 5 + rand.nextInt(6);
        int[] tab = new int[rozmiar];
        for (int i = 0; i < rozmiar; i++) {
            int parz = 2 + (rand.nextInt(7));
            while (parz % 2 != 0)
                parz = 2 + rand.nextInt(7);
            tab[i] = parz;
        }
        return tab;
    }

    public static void wypisz_tablice (int []tab) {

        for (int i = 0; i < tab.length; i++)
        {
            System.out.print(tab[i] + ", ");
        }
    }

    public static int zwrocElementWSrodku (int[] tab)
    {
        int ostatni = tab[tab.length/2];
        return ostatni;
    }

    public static class Figura {
        private String szerokość;
        private String wysokość;

        public Figura(String otoSzerokosc, String otoWysokosc) {
            this.szerokość = otoSzerokosc;
            this.wysokość = otoWysokosc;
        }
        public Figura(){};

        @Override
        public boolean equals(Object obj){
            Figura fg = (Figura) obj;
            return (fg.szerokość.equals(this.szerokość) && fg.wysokość.equals(this.wysokość));
        }
    }

    public abstract static class Kwadrat extends Figura implements Comparable<Figura> {
        private final String dlugoscBokuOstatnioUtworzonegoKwadrata;

        public Kwadrat(String otoDlugoscBoku)
        {
            this.dlugoscBokuOstatnioUtworzonegoKwadrata = otoDlugoscBoku;
        }

        public int compareTo (Kwadrat kw) {
            int cmp_dlugosc = this.dlugoscBokuOstatnioUtworzonegoKwadrata.compareTo(kw.dlugoscBokuOstatnioUtworzonegoKwadrata);
            return cmp_dlugosc;
            }
        }

    public static void main(String[] args) {
        int []tab = stworzTablice();
        wypisz_tablice(tab);
        System.out.println();
        System.out.println(zwrocElementWSrodku(tab));

        ArrayList<Figura> figury = new ArrayList<>(3);
        figury.add(new Figura("10", "20"));
        figury.add(new Figura("30", "35"));
        figury.add(new Figura("30", "35"));

        System.out.println(figury.get(0).equals(figury.get(1)));
        System.out.println(figury.get(1).equals(figury.get(2)));

        ArrayList<Kwadrat> kwadrats = new ArrayList<>(3);
        kwadrats.add(new Kwadrat("20") {
            @Override
            public int compareTo(Figura o) {
                return 0;
            }
        });
        kwadrats.add(new Kwadrat("30") {
            @Override
            public int compareTo(Figura o) {
                return 0;
            }
        });
        kwadrats.add(new Kwadrat("15") {
            @Override
            public int compareTo(Figura o) {
                return 0;
            }
        });
    }
    }
