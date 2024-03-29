package org.javarush.island.kalnaya.entities.organisms.animals.herbivor;

import org.javarush.island.kalnaya.entities.island.Location;
import org.javarush.island.kalnaya.entities.organisms.animals.Animal;

public abstract class Herbivor extends Animal {

    public Herbivor() {
        super();
    }

    @Override
    public void eat(Location location) {
        super.eat(location);
    }
}
