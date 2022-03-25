package com.company;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    public static final int MAX_HERO_CAPACITY = 1;
    private String name;
    private Leader leader;
    private List<Hero> heroes = new ArrayList<>(MAX_HERO_CAPACITY);

    public Squad(String name) {
        this.name = name;
    }
    public void setLeader(Leader l) {
        this.leader = l;
    }
    @Override
    public String toString() {
        StringBuilder heroes = new StringBuilder();
        for(Hero h: this.heroes){
            heroes.append(h.getName());
            heroes.append(" ");
        }
        return "Squad{" +
                "name='" + name + '\'' +
                ", Leader=" + leader.getName() +
                ", heroes=" + heroes.toString() +
                '}';
    }

    public void addHero(Hero h) throws TooManyHeroesException{
       if(heroes.size()<MAX_HERO_CAPACITY){
        heroes.add(h);
    }else{
           throw new TooManyHeroesException();
       }
    }
}
