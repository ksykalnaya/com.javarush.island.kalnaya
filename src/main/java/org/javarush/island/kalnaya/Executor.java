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

        //0. Ловлю зацикливание deadlock при перемещении
        //1. Примитивно реализован метод animals.move
        //2. Попробовать применить патерн Factory/Builder
        //3. Добавить инициализацию полей

    }
}
