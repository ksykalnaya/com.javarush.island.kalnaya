package org.javarush.island.kalnaya.services;

import org.javarush.island.kalnaya.entities.island.Location;
import org.javarush.island.kalnaya.entities.organisms.plants.Plant;

public class PlantTask implements Runnable{
    private Location location;
    public PlantTask(Location location){
        this.location = location;
    }

    @Override
    public void run() {
        plantsGrow();
    }

    private void plantsGrow(){
        Plant.grow(location);
    }
}
