package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Postac> Humans = new ArrayList<>(3);
        Humans.add(new Characters("Vexon", Type_of_char.human));
        Humans.add(new Characters("Carlo", Type_of_char.human));
        Humans.add(new Characters("Wrobelek", Type_of_char.queen));

        ArrayList<Postac> Fantasy = new ArrayList<>(3);
        Fantasy.add(new Characters("Kili", Type_of_char.dwarf));
        Fantasy.add(new Characters("Fili", Type_of_char.dwarf));
        Fantasy.add(new Characters("Thorin", Type_of_char.dwarf));

        Characters Spike = new Characters("Spike", Type_of_char.dog);
    }
}
