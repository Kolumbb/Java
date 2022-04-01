package com.company;

public class Animal {
    private String name;
    private int weight;
    private int high;
    private int topSpeed;

    public Animal(String name, int weight, int high, int topSpeed) {
        this.name = name;
        this.weight = weight;
        this.high = high;
        this.topSpeed = topSpeed;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getHigh() {
        return high;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", high=" + high +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
