package com.company;
import java.util.ArrayList;
import java.util.List;
public interface TerrainMap {

    TerrainType terrain = TerrainType.DESERT;
    CatastrophieType catastrophie = null;
    List<MobFighter> enemies = new ArrayList<>();

    public void changeTerrain (TerrainType t);
    public void createCatastrophie(CatastrophieType c);

    enum TerrainType{
        DESERT, OCEAN, MOUNTAIN
    }

    enum CatastrophieType {
        SANDSTORM,TSUNAMI, EARTHQUAKE
    }
}
