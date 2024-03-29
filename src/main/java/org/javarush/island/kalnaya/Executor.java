package org.javarush.island.kalnaya;

import org.javarush.island.kalnaya.entities.island.Island;
import org.javarush.island.kalnaya.properties.Settings;
import org.javarush.island.kalnaya.services.LifeStarter;
import org.javarush.island.kalnaya.services.IslandCreator;
import org.javarush.island.kalnaya.utils.Utils;

public class Executor {
    public static void main(String[] args) {

        boolean continueWork = Utils.initializeFields();
        if(!continueWork){ return; }

        Island island = IslandCreator.create(Settings.ISLAND_SIZE_X,Settings.ISLAND_SIZE_Y);
        LifeStarter lifeStarter = new LifeStarter(island);
        lifeStarter.start();
    }
}
