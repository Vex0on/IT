package com.company;

public class RachunekBankowy {

	static double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(double kwota) {
        saldo = kwota;
    }

    public double Obliczmiesieczneodsetki() {
        double odsetki = (saldo*rocznaStopaProcentowa) / 12;
        saldo += odsetki;
        return saldo;
    }

    public static void setRocznaStopaProcentowa(double NowaStopa) {
        rocznaStopaProcentowa = NowaStopa;
    }

}
