package org.javarush.island.kalnaya.entities.organisms.plants;

import org.javarush.island.kalnaya.entities.island.Location;
import org.javarush.island.kalnaya.entities.organisms.Organisms;
import org.javarush.island.kalnaya.properties.Settings;
import org.javarush.island.kalnaya.utils.Utils;

public class Plant extends Organisms {
    public Plant(){
        weight = Utils.getWeight(this.getClass());
    }

    public static void grow(Location location){
        for (int i = 0; i < Settings.PLANT_GROWTH; i++) {
            location.addOrganism(new Plant());
        }
    }
}
