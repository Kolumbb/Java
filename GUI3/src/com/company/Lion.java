package com.company;

public class Lion extends ACarnivore{
    public Lion(String name, com.company.group group) {
        super(name, group);
    }

    @Override
    public boolean isScavenger() {
        return false;
    }
}
