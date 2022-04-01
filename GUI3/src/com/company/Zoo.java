package com.company;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Enclosure> enclosureList = new ArrayList<>();
    private List<Worker> workerList = new ArrayList<>();

    public List<Enclosure> getEnclosureList(){
        return enclosureList;
    }
    public List<Worker> getWorkerList(){
        return workerList;
    }
    public void addEnclosure(Enclosure enclosure){
        this.enclosureList.add(enclosure);
    }

    public void showAllAnimals(){
        System.out.println(enclosureList.toString());
    }
    public void showAllWorkers(){
        System.out.println(workerList.toString());
    }
}
