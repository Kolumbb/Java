package com.company;

public abstract class ACarnivore extends  AAnimal{

    public ACarnivore(String name, group group) {
        super(name, group);
    }

    public abstract boolean isScavenger();
}
