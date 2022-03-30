package com.company;

public abstract class Postac {

    private String name;
    private int lvl;
    private int hp;
    private int armor;
    private int mana;
    private int strength;
    private Type_of_char race;

    public Postac(String name, int lvl, int hp, int armor, int mana, int strength, Type_of_char race)
    {
        this.name = name;
        this.lvl = lvl;
        this.hp = hp;
        this.armor = armor;
        this.mana = mana;
        this.strength = strength;
        this.race = race;
    }

    // Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setLvl(int lvl)
    {
        this.lvl = lvl;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public void setArmor(int armor)
    {
        this.armor = armor;
    }

    public void setMana(int mana)
    {
        this.mana = mana;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }

    public void setRace(Type_of_char race)
    {
        this.race = race;
    }

    // Getters

    public String getName() {return name;}
    public int getLvl() {return lvl;}
    public int getHp() {return hp;}
    public int getArmor() {return armor;}
    public int getMana() {return mana;}
    public int getStrength() {return strength;}
    public Type_of_char getRace() {return race;}

}
