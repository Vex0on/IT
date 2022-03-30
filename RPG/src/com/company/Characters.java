package com.company;

public class Characters extends Postac{

    private int exp_value;

    public Characters(String name, Type_of_char race)
    {
        super(name,0, 0, 0, 0, 0, race);

        // Types_of_characters
        // People
        if (race.name() == "human")
        {
            this.setHp(100);
            this.setArmor(2);
            this.setMana(10);
            this.setStrength(15); // Max 100
        }

        if (race.name() == "queen")
        {
            this.setHp(200);
            this.setArmor(10);
            this.setMana(50);
            this.setStrength(10); // Max 100
        }

        // Fantasy
        else if (race.name() == "dwarf")
        {
            this.setHp(80);
            this.setArmor(3);
            this.setMana(5);
            this.setStrength(30); // Max 100
        }

        // Animals
        else if (race.name() == "dog") // Not playable
        {
            this.setHp(30);
            this.setArmor(0);
            this.setMana(0);
            this.setStrength(8); // Max 100
        }


    }

    // EXP and lvling scripts
    public void exp_gain(int xp)
    {
        int exp_need = 100;
        this.exp_value += xp;
        if (this.exp_value == exp_need)
        {
            lvlup();
            this.exp_value = 0;
            exp_need *= 1.5;
        }
    }

    public void lvlup()
    {
        this.setLvl(this.getLvl()+1);
        if(this.getRace().name() == "human")
        {
            this.setHp(this.getHp()+5);
            this.setArmor(this.getArmor()+1);
            this.setMana(this.getMana()+1);
            this.setStrength(this.getStrength()+1);
        }

        else if(this.getRace().name() == "queen")
        {
            this.setHp(this.getHp()+10);
            this.setArmor(this.getArmor()+2);
            this.setMana(this.getMana()+2);
            this.setStrength(this.getStrength()+1);
        }

        else if(this.getRace().name() == "dwarf")
        {
            this.setHp(this.getHp()+2);
            this.setArmor(this.getArmor()+2);
            this.setMana(this.getMana()+1);
            this.setStrength(this.getStrength()+3);
        }
    }

}
