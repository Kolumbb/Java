package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main{
    public static void main(String[] args) {
        //Zadanie_01
        Icalc myAdd = (a, b) -> {return a+b;};
        Icalc mySubstract = (a, b) ->{return a-b;};
        Icalc myMultiply = (a, b) -> a*b;
        Icalc myDivide = (a, b) -> a/b;
        //Zadanie_2
        Animal animal1 = new Animal("Mała", 11, 2, 11);
        Animal animal2 = new Animal("Biały", 67, 12, 2);
        Animal animal3 = new Animal("Nunu", 21, 2, 66);
        Animal animal4 = new Animal("Papi", 123, 5, 567);
        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
        System.out.println("Opcja_01");
        for (Animal animal : animalList)
            if(animal.getWeight()>11)
                if(animal.getHigh()>2)
                    System.out.println(animal.getName());
        System.out.println("Opcja_02");
        animalList.stream().filter(animal -> animal.getWeight()>11).
                filter(animal -> animal.getHigh()>2).
                map(animal -> animal.getName()).forEach(y -> System.out.println(y));
        //Zadanie_03
        Predicate<Animal> f1 = animal -> animal.getWeight() >11;
        Predicate<Animal> f2 = animal -> animal.getHigh() >2;
        animalList.stream().filter(f1).filter(f2).map(animal -> animal.getName()).forEach(s -> System.out.println(s));
        //Zadanie_04
        Scanner in = new Scanner(System.in);
        System.out.println("Mniejsze od jakiej wagi?");
        int scan1 = in.nextInt();
        System.out.println("Mniejsze od jakiej wielkości?");
        int scan2 = in.nextInt();
        Predicate<Animal> f3 = animal -> animal.getWeight() > scan1;
        Predicate<Animal> f4 = animal -> animal.getHigh() > scan2;
        animalList.stream().filter(f3).filter(f4).map(animal -> animal.getName()).forEach(s -> System.out.println(s));
        //Zadanie_05
        animalList.sort(
                (o2, o1) -> o1.getWeight() - o2.getWeight());
        System.out.println(animalList);
    }
}
