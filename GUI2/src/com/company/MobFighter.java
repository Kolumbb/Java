package com.company;

public class MobFighter extends Character{

    private double magicItem;

    public MobFighter(String name, int level, double attack, double defence, double health, double magicItem) {
        super(name, level, attack, defence, health + magicItem);
    }

    @Override
    public void attack(Character c) {
        c.setHealth(c.getHealth()-c.getAttack()/2);
    }
    public int compareTo(Object o) {
        if (o instanceof Character) {
            Character c = (Character) o;
            if (c.getLevel() > getLevel()) {
                setLevel(getLevel() + 1);
                return 1;
            }
        }
        return 0;
    }
}
