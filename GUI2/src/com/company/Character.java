package com.company;
import java.lang.*;

public abstract class Character {
    private String name;
    private int level;
    private double attack;
    private double defence;
    private double health;

    public Character(String name, int level, double attack, double defence, double health) {
        this.name = name;
        this.level = level;
        this.attack = attack;
        this.defence = defence;
        this.health = health;
    }
    public Character(String name){
        this.name = name;
        health=10;
        defence=10;
        attack=10;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public double getAttack() {
        return attack;
    }

    public double getDefence() {
        return defence;
    }

    public double getHealth() {
        return health;
    }

    public abstract void attack(Character c);

}
