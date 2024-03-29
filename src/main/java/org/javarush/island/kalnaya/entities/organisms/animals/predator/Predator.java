package org.javarush.island.kalnaya.entities.organisms.animals.predator;

import org.javarush.island.kalnaya.entities.island.Location;
import org.javarush.island.kalnaya.entities.organisms.animals.Animal;

public abstract class Predator extends Animal {

    public Predator() {
        super();
    }
    @Override
    public void eat(Location location) {
        super.eat(location);
    }
}
