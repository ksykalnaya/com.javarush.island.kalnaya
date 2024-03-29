package org.javarush.island.kalnaya;

import org.javarush.island.kalnaya.entities.island.Island;
import org.javarush.island.kalnaya.properties.Settings;
import org.javarush.island.kalnaya.services.LifeStarter;
import org.javarush.island.kalnaya.services.IslandCreator;

public class Executor {
    public static void main(String[] args) {

        Island island = IslandCreator.create(Settings.ISLAND_SIZE_X,Settings.ISLAND_SIZE_Y);
        LifeStarter lifeStarter = new LifeStarter(island);
        lifeStarter.start();


    }
}
