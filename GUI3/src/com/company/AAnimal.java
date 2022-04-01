package com.company;

public abstract class AAnimal {
    private String name;
    private group group;

    public AAnimal(String name, group group) {
        this.name = name;
        this.group = group;
    }

    public String toString(){
        return this.name + this.group;
    }

    public String getName() {
        return name;
    }
}
