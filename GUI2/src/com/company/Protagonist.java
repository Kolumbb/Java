package com.company;

public class Protagonist extends Character{

    private double armor;

    public Protagonist(String name, int level, double attack, double defence, double health, double armor) {
        super(name, level, attack, defence + armor, health);
    }

    @Override
    public void attack(Character c) {
        c.setDefence(c.getDefence()-c.getAttack()/2);
        c.setHealth(c.getHealth()-c.getAttack()/2);
    }
}
