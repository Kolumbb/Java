package com.company;

public class Worker {
    private String name;

    public void cleanAnimal(AAnimal animal){
        System.out.println("Cleaning" + animal);
    }
    public void feedAnimal(AAnimal animal){
        System.out.println("Feeding " + animal);
    }

    public Worker (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.name;
    }
}
