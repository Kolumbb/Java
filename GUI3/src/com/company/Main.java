package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Zadanie_01
        //Kontener <String> kontener0 = new Kontener<>("Dupa");
        //Kontener <Integer> kontener1 = new Kontener<>(777);
       //kontener0.wypisz();
        //kontener1.wypisz();
        //Zadanie_02
        Kontener <String, Integer> kontener3 = new Kontener<>("Dupa", 777);
        Kontener <String, Integer> kontener4 = new Kontener<>("Pupa", 777);
        kontener3.wypisz();
        kontener4.wypisz();
        //Zadanie_03
        HashSet<Integer> set = new HashSet<>();
        set.add(31);
        set.add(28);
        set.add(31);
        set.add(30);
        System.out.println(set.size());
        System.out.println(set);
        //Zadanie_04
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Styczeń", 31);
        mapa.put("Luty", 28);
        mapa.put("Marzec", 31);
        mapa.put("Kwiecień", 30);
        System.out.println(mapa.size());
        System.out.println(mapa.get("Marzec"));
        System.out.println(mapa);
        //Zadanie_06
        Osoba kowalski = new Osoba("Jan", "Kowalski");
        Osoba nowak = new Osoba("Adam", "Nowak");
        Osoba krawczyk = new Osoba("Bartosz", "Krawczyk");
        Osoba heniek = new Osoba("Kierownik", "Heniek");

        Samochod skoda1 = new Samochod("WA00001", "Skoda");
        Samochod skoda2 = new Samochod("SC36010", "Skoda");
        Samochod mazda1 = new Samochod("WA01234", "Mazda");
        Samochod mazda2 = new Samochod("DW01ASD", "Mazda");
        Samochod bmw = new Samochod("WA12690", "BMW");
        Samochod volvo = new Samochod("KR60606", "Volvo");

        /*
        Jan Kowalski -> SKODA WA00001, BMW WA12690
        Adam Nowak -> MAZDA DW01ASD
        Bartosz Krawczyk -> VOLVO KR60606, MAZDA WA01234, SKODA SC36010
        Kierownik Heniek -> [Brak samochod´ow]
        Samochody, kt´orych numery rejestracyjne zaczynaja sie na WA:
        SKODA WA00001 * BMW WA12690 * MAZDA WA01234 *
        */
        HashMap<Osoba, List<Samochod>> samochodyWlascicieli = new HashMap<Osoba, List<Samochod>>();
        samochodyWlascicieli.put(kowalski,new ArrayList<>());
        samochodyWlascicieli.get(kowalski).add(skoda1);
        samochodyWlascicieli.get(kowalski).add(bmw);

        samochodyWlascicieli.put(nowak, new ArrayList<>());
        samochodyWlascicieli.get(nowak).add(mazda2);

        samochodyWlascicieli.put(krawczyk, new ArrayList<>());
        samochodyWlascicieli.get(krawczyk).add(volvo);
        samochodyWlascicieli.get(krawczyk).add(mazda1);
        samochodyWlascicieli.get(krawczyk).add(skoda2);

        samochodyWlascicieli.put(heniek, new ArrayList<>());

        for(Map.Entry entry : samochodyWlascicieli.entrySet())
            System.out.println(entry);
        System.out.println("================");
        for (Map.Entry <Osoba, List<Samochod>> entry : samochodyWlascicieli.entrySet())
            for(Samochod samochod: entry.getValue())
                if(samochod.getNrRej().contains("WA"))
                    System.out.println(samochod);
        //Zadanie_07
        Zoo zoo = new Zoo();
        Enclosure<ACarnivore> aCarnivoreEnclosure = new Enclosure<>();
        zoo.addEnclosure(aCarnivoreEnclosure);

        Worker workerNormal = new Worker("Bob");

        Worker workerDoc = new Worker("Dorian"){
            public void healAnimal(AAnimal animal){
                System.out.println("healing " + animal);
            }
            @Override
            public String toString() {
                return "$classname{" +
                        "name='" + this.getName() + '\'' +
                        "speciality='" + "Doc" + '\'' +
                        '}';
            }
        };


        zoo.getWorkerList().add(workerNormal);
        zoo.getWorkerList().add(workerDoc);

        aCarnivoreEnclosure.addAnimalToEnclosure(new Lion("HappyLion", group.MAMMAL));
        //aCarnivoreEnclosure.addAnimalToEnclosure(new Giraffe("SuperSadGiraff", Group.MAMMAL));


        zoo.addEnclosure(new Enclosure<AHerbivore>());
        zoo.getEnclosureList().get(1).addAnimalToEnclosure(new Giraffe("HappyGiraff", group.MAMMAL));
        zoo.getEnclosureList().get(1).addAnimalToEnclosure(new Lion("SuperHappyLion", group.MAMMAL));
        zoo.getEnclosureList().get(1).getEnclosure().add(workerNormal);

        zoo.showAllAnimals();
        System.out.println();
        zoo.showAllWorkers();


    }



}
