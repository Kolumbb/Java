package com.company;

public class Ocean implements TerrainMap{
    @Override
    public void changeTerrain(TerrainType t) {

    }

    @Override
    public void createCatastrophie(CatastrophieType c) {
        System.out.println("There is a tsunami!");
    }
}
