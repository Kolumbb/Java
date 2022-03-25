package com.company;

public class Hero {
    private String name;
    private int age;

    public Hero (String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return this.name;
    }

    public void sayHelloTo(Hero h){
        System.out.println("Hello " + this.getName());
    }
}
