package com.company;

public class TEST_RachunekBankowy {
    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(3000);
        RachunekBankowy saver2 = new RachunekBankowy(2000);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        System.out.println(saver1.Obliczmiesieczneodsetki());
        System.out.println(saver2.Obliczmiesieczneodsetki());


        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        System.out.println(saver1.Obliczmiesieczneodsetki());
        System.out.println(saver2.Obliczmiesieczneodsetki());


    }

}