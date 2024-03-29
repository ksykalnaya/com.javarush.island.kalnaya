package org.javarush.island.kalnaya.properties;

import org.javarush.island.kalnaya.entities.organisms.animals.*;
import org.javarush.island.kalnaya.entities.organisms.animals.herbivor.*;
import org.javarush.island.kalnaya.entities.organisms.animals.predator.*;
import org.javarush.island.kalnaya.entities.organisms.plants.Plant;
import org.javarush.island.kalnaya.utils.Utils;
import java.util.HashMap;
import java.util.Map;

public class Settings {
    public static final Integer ISLAND_SIZE_X = 10;
    public static final Integer ISLAND_SIZE_Y = 5;
    public static final Integer PLANT_GROWTH = 50;
    public static final Integer STEP_DURATION = 5;
    public static final Integer SIMULATION_STEPS = 5;
    public static final Map<Class<?>,float[]> ORGANISMS_PARAMETERS = new HashMap<>();
    public static final Map<Class<?>,String> EMOJI = new HashMap<>();
    public static final  Map<Class<? extends Animal>,Map<Class<?>,Integer>> PROBABILITY_EAT = new HashMap<>();
    private Settings (){throw new IllegalStateException("Settings class");}

    static {
        Utils.addElement(PROBABILITY_EAT,Wolf.class,Wolf.class,0);
        Utils.addElement(PROBABILITY_EAT,Wolf.class, Snake.class,0);
        Utils.addElement(PROBABILITY_EAT,Wolf.class, Fox.class,0);
        Utils.addElement(PROBABILITY_EAT,Wolf.class, Bear.class,0);
        Utils.addElement(PROBABILITY_EAT,Wolf.class, Eagle.class,0);
        Utils.addElement(PROBABILITY_EAT,Wolf.class, Horse.class,10);
        Utils.addElement(PROBABILITY_EAT,Wolf.class, Deer.class,15);
        Utils.addElement(PROBABILITY_EAT,Wolf.class, Rabbit.class,60);
        Utils.addElement(PROBABILITY_EAT,Wolf.class, Mouse.class,80);
        Utils.addElement(PROBABILITY_EAT,Wolf.class, Goat.class,60);
        Utils.addElement(PROBABILITY_EAT,Wolf.class, Sheep.class,70);
        Utils.addElement(PROBABILITY_EAT,Wolf.class, Boar.class,15);
        Utils.addElement(PROBABILITY_EAT,Wolf.class, Bull.class,10);
        Utils.addElement(PROBABILITY_EAT,Wolf.class, Duck.class,40);
        Utils.addElement(PROBABILITY_EAT,Wolf.class, Caterpillar.class,0);
        Utils.addElement(PROBABILITY_EAT,Wolf.class, Plant.class,0);

        Utils.addElement(PROBABILITY_EAT,Snake.class, Wolf.class,0);
        Utils.addElement(PROBABILITY_EAT,Snake.class, Fox.class,15);
        Utils.addElement(PROBABILITY_EAT,Snake.class, Bear.class,0);
        Utils.addElement(PROBABILITY_EAT,Snake.class, Eagle.class,0);
        Utils.addElement(PROBABILITY_EAT,Snake.class, Horse.class,0);
        Utils.addElement(PROBABILITY_EAT,Snake.class, Deer.class,0);
        Utils.addElement(PROBABILITY_EAT,Snake.class, Rabbit.class,20);
        Utils.addElement(PROBABILITY_EAT,Snake.class, Mouse.class,40);
        Utils.addElement(PROBABILITY_EAT,Snake.class, Goat.class,0);
        Utils.addElement(PROBABILITY_EAT,Snake.class, Sheep.class,0);
        Utils.addElement(PROBABILITY_EAT,Snake.class, Boar.class,0);
        Utils.addElement(PROBABILITY_EAT,Snake.class, Bull.class,0);
        Utils.addElement(PROBABILITY_EAT,Snake.class, Duck.class,10);
        Utils.addElement(PROBABILITY_EAT,Snake.class, Caterpillar.class,0);
        Utils.addElement(PROBABILITY_EAT,Snake.class, Plant.class,0);

        Utils.addElement(PROBABILITY_EAT,Fox.class, Wolf.class,0);
        Utils.addElement(PROBABILITY_EAT,Fox.class, Snake.class,0);
        Utils.addElement(PROBABILITY_EAT,Fox.class, Bear.class,0);
        Utils.addElement(PROBABILITY_EAT,Fox.class, Eagle.class,0);
        Utils.addElement(PROBABILITY_EAT,Fox.class, Horse.class,0);
        Utils.addElement(PROBABILITY_EAT,Fox.class, Deer.class,0);
        Utils.addElement(PROBABILITY_EAT,Fox.class, Rabbit.class,70);
        Utils.addElement(PROBABILITY_EAT,Fox.class, Mouse.class,90);
        Utils.addElement(PROBABILITY_EAT,Fox.class, Goat.class,0);
        Utils.addElement(PROBABILITY_EAT,Fox.class, Sheep.class,0);
        Utils.addElement(PROBABILITY_EAT,Fox.class, Boar.class,0);
        Utils.addElement(PROBABILITY_EAT,Fox.class, Bull.class,0);
        Utils.addElement(PROBABILITY_EAT,Fox.class, Duck.class,60);
        Utils.addElement(PROBABILITY_EAT,Fox.class, Caterpillar.class,40);
        Utils.addElement(PROBABILITY_EAT,Fox.class, Plant.class,0);

        Utils.addElement(PROBABILITY_EAT,Bear.class, Wolf.class,0);
        Utils.addElement(PROBABILITY_EAT,Bear.class, Snake.class,80);
        Utils.addElement(PROBABILITY_EAT,Bear.class, Fox.class,0);
        Utils.addElement(PROBABILITY_EAT,Bear.class, Eagle.class,0);
        Utils.addElement(PROBABILITY_EAT,Bear.class, Horse.class,40);
        Utils.addElement(PROBABILITY_EAT,Bear.class, Deer.class,80);
        Utils.addElement(PROBABILITY_EAT,Bear.class, Rabbit.class,80);
        Utils.addElement(PROBABILITY_EAT,Bear.class, Mouse.class,90);
        Utils.addElement(PROBABILITY_EAT,Bear.class, Goat.class,70);
        Utils.addElement(PROBABILITY_EAT,Bear.class, Sheep.class,70);
        Utils.addElement(PROBABILITY_EAT,Bear.class, Boar.class,50);
        Utils.addElement(PROBABILITY_EAT,Bear.class, Bull.class,20);
        Utils.addElement(PROBABILITY_EAT,Bear.class, Duck.class,10);
        Utils.addElement(PROBABILITY_EAT,Bear.class, Caterpillar.class,0);
        Utils.addElement(PROBABILITY_EAT,Bear.class, Plant.class,0);

        Utils.addElement(PROBABILITY_EAT,Eagle.class, Wolf.class,0);
        Utils.addElement(PROBABILITY_EAT,Eagle.class, Snake.class,0);
        Utils.addElement(PROBABILITY_EAT,Eagle.class, Fox.class,10);
        Utils.addElement(PROBABILITY_EAT,Eagle.class, Bear.class,0);
        Utils.addElement(PROBABILITY_EAT,Eagle.class, Horse.class,0);
        Utils.addElement(PROBABILITY_EAT,Eagle.class, Deer.class,0);
        Utils.addElement(PROBABILITY_EAT,Eagle.class, Rabbit.class,90);
        Utils.addElement(PROBABILITY_EAT,Eagle.class, Mouse.class,90);
        Utils.addElement(PROBABILITY_EAT,Eagle.class, Goat.class,0);
        Utils.addElement(PROBABILITY_EAT,Eagle.class, Sheep.class,0);
        Utils.addElement(PROBABILITY_EAT,Eagle.class, Boar.class,0);
        Utils.addElement(PROBABILITY_EAT,Eagle.class, Bull.class,0);
        Utils.addElement(PROBABILITY_EAT,Eagle.class, Duck.class,80);
        Utils.addElement(PROBABILITY_EAT,Eagle.class, Caterpillar.class,0);
        Utils.addElement(PROBABILITY_EAT,Eagle.class, Plant.class,0);

        Utils.addElement(PROBABILITY_EAT,Horse.class, Wolf.class,0);
        Utils.addElement(PROBABILITY_EAT,Horse.class, Snake.class,0);
        Utils.addElement(PROBABILITY_EAT,Horse.class, Fox.class,0);
        Utils.addElement(PROBABILITY_EAT,Horse.class, Bear.class,0);
        Utils.addElement(PROBABILITY_EAT,Horse.class, Eagle.class,0);
        Utils.addElement(PROBABILITY_EAT,Horse.class, Deer.class,0);
        Utils.addElement(PROBABILITY_EAT,Horse.class, Rabbit.class,0);
        Utils.addElement(PROBABILITY_EAT,Horse.class, Mouse.class,0);
        Utils.addElement(PROBABILITY_EAT,Horse.class, Goat.class,0);
        Utils.addElement(PROBABILITY_EAT,Horse.class, Sheep.class,0);
        Utils.addElement(PROBABILITY_EAT,Horse.class, Boar.class,0);
        Utils.addElement(PROBABILITY_EAT,Horse.class, Bull.class,0);
        Utils.addElement(PROBABILITY_EAT,Horse.class, Duck.class,0);
        Utils.addElement(PROBABILITY_EAT,Horse.class, Caterpillar.class,0);
        Utils.addElement(PROBABILITY_EAT,Horse.class, Plant.class,100);

        Utils.addElement(PROBABILITY_EAT,Deer.class, Wolf.class,0);
        Utils.addElement(PROBABILITY_EAT,Deer.class, Snake.class,0);
        Utils.addElement(PROBABILITY_EAT,Deer.class, Fox.class,0);
        Utils.addElement(PROBABILITY_EAT,Deer.class, Bear.class,0);
        Utils.addElement(PROBABILITY_EAT,Deer.class, Eagle.class,0);
        Utils.addElement(PROBABILITY_EAT,Deer.class, Horse.class,0);
        Utils.addElement(PROBABILITY_EAT,Deer.class, Rabbit.class,0);
        Utils.addElement(PROBABILITY_EAT,Deer.class, Mouse.class,0);
        Utils.addElement(PROBABILITY_EAT,Deer.class, Goat.class,0);
        Utils.addElement(PROBABILITY_EAT,Deer.class, Sheep.class,0);
        Utils.addElement(PROBABILITY_EAT,Deer.class, Boar.class,0);
        Utils.addElement(PROBABILITY_EAT,Deer.class, Bull.class,0);
        Utils.addElement(PROBABILITY_EAT,Deer.class, Duck.class,0);
        Utils.addElement(PROBABILITY_EAT,Deer.class, Caterpillar.class,0);
        Utils.addElement(PROBABILITY_EAT,Deer.class, Plant.class,100);

        Utils.addElement(PROBABILITY_EAT,Rabbit.class, Wolf.class,0);
        Utils.addElement(PROBABILITY_EAT,Rabbit.class, Snake.class,0);
        Utils.addElement(PROBABILITY_EAT,Rabbit.class, Fox.class,0);
        Utils.addElement(PROBABILITY_EAT,Rabbit.class, Bear.class,0);
        Utils.addElement(PROBABILITY_EAT,Rabbit.class, Eagle.class,0);
        Utils.addElement(PROBABILITY_EAT,Rabbit.class, Horse.class,0);
        Utils.addElement(PROBABILITY_EAT,Rabbit.class, Deer.class,0);
        Utils.addElement(PROBABILITY_EAT,Rabbit.class, Mouse.class,0);
        Utils.addElement(PROBABILITY_EAT,Rabbit.class, Goat.class,0);
        Utils.addElement(PROBABILITY_EAT,Rabbit.class, Sheep.class,0);
        Utils.addElement(PROBABILITY_EAT,Rabbit.class, Boar.class,0);
        Utils.addElement(PROBABILITY_EAT,Rabbit.class, Bull.class,0);
        Utils.addElement(PROBABILITY_EAT,Rabbit.class, Duck.class,0);
        Utils.addElement(PROBABILITY_EAT,Rabbit.class, Caterpillar.class,0);
        Utils.addElement(PROBABILITY_EAT,Rabbit.class, Plant.class,100);

        Utils.addElement(PROBABILITY_EAT,Mouse.class, Wolf.class,0);
        Utils.addElement(PROBABILITY_EAT,Mouse.class, Snake.class,0);
        Utils.addElement(PROBABILITY_EAT,Mouse.class, Fox.class,0);
        Utils.addElement(PROBABILITY_EAT,Mouse.class, Bear.class,0);
        Utils.addElement(PROBABILITY_EAT,Mouse.class, Eagle.class,0);
        Utils.addElement(PROBABILITY_EAT,Mouse.class, Horse.class,0);
        Utils.addElement(PROBABILITY_EAT,Mouse.class, Deer.class,0);
        Utils.addElement(PROBABILITY_EAT,Mouse.class, Rabbit.class,0);
        Utils.addElement(PROBABILITY_EAT,Mouse.class, Goat.class,0);
        Utils.addElement(PROBABILITY_EAT,Mouse.class, Sheep.class,0);
        Utils.addElement(PROBABILITY_EAT,Mouse.class, Boar.class,0);
        Utils.addElement(PROBABILITY_EAT,Mouse.class, Bull.class,0);
        Utils.addElement(PROBABILITY_EAT,Mouse.class, Duck.class,0);
        Utils.addElement(PROBABILITY_EAT,Mouse.class, Caterpillar.class,90);
        Utils.addElement(PROBABILITY_EAT,Mouse.class, Plant.class,100);

        Utils.addElement(PROBABILITY_EAT,Goat.class, Wolf.class,0);
        Utils.addElement(PROBABILITY_EAT,Goat.class, Snake.class,0);
        Utils.addElement(PROBABILITY_EAT,Goat.class, Fox.class,0);
        Utils.addElement(PROBABILITY_EAT,Goat.class, Bear.class,0);
        Utils.addElement(PROBABILITY_EAT,Goat.class, Eagle.class,0);
        Utils.addElement(PROBABILITY_EAT,Goat.class, Horse.class,0);
        Utils.addElement(PROBABILITY_EAT,Goat.class, Deer.class,0);
        Utils.addElement(PROBABILITY_EAT,Goat.class, Rabbit.class,0);
        Utils.addElement(PROBABILITY_EAT,Goat.class, Mouse.class,0);
        Utils.addElement(PROBABILITY_EAT,Goat.class, Sheep.class,0);
        Utils.addElement(PROBABILITY_EAT,Goat.class, Boar.class,0);
        Utils.addElement(PROBABILITY_EAT,Goat.class, Bull.class,0);
        Utils.addElement(PROBABILITY_EAT,Goat.class, Duck.class,0);
        Utils.addElement(PROBABILITY_EAT,Goat.class, Caterpillar.class,0);
        Utils.addElement(PROBABILITY_EAT,Goat.class, Plant.class,100);

        Utils.addElement(PROBABILITY_EAT,Sheep.class, Wolf.class,0);
        Utils.addElement(PROBABILITY_EAT,Sheep.class, Snake.class,0);
        Utils.addElement(PROBABILITY_EAT,Sheep.class, Fox.class,0);
        Utils.addElement(PROBABILITY_EAT,Sheep.class, Bear.class,0);
        Utils.addElement(PROBABILITY_EAT,Sheep.class, Eagle.class,0);
        Utils.addElement(PROBABILITY_EAT,Sheep.class, Horse.class,0);
        Utils.addElement(PROBABILITY_EAT,Sheep.class, Deer.class,0);
        Utils.addElement(PROBABILITY_EAT,Sheep.class, Rabbit.class,0);
        Utils.addElement(PROBABILITY_EAT,Sheep.class, Mouse.class,0);
        Utils.addElement(PROBABILITY_EAT,Sheep.class, Goat.class,0);
        Utils.addElement(PROBABILITY_EAT,Sheep.class, Boar.class,0);
        Utils.addElement(PROBABILITY_EAT,Sheep.class, Bull.class,0);
        Utils.addElement(PROBABILITY_EAT,Sheep.class, Duck.class,0);
        Utils.addElement(PROBABILITY_EAT,Sheep.class, Caterpillar.class,0);
        Utils.addElement(PROBABILITY_EAT,Sheep.class, Plant.class,100);

        Utils.addElement(PROBABILITY_EAT,Boar.class, Wolf.class,0);
        Utils.addElement(PROBABILITY_EAT,Boar.class, Snake.class,0);
        Utils.addElement(PROBABILITY_EAT,Boar.class, Fox.class,0);
        Utils.addElement(PROBABILITY_EAT,Boar.class, Bear.class,0);
        Utils.addElement(PROBABILITY_EAT,Boar.class, Eagle.class,0);
        Utils.addElement(PROBABILITY_EAT,Boar.class, Horse.class,0);
        Utils.addElement(PROBABILITY_EAT,Boar.class, Deer.class,0);
        Utils.addElement(PROBABILITY_EAT,Boar.class, Rabbit.class,0);
        Utils.addElement(PROBABILITY_EAT,Boar.class, Mouse.class,50);
        Utils.addElement(PROBABILITY_EAT,Boar.class, Goat.class,0);
        Utils.addElement(PROBABILITY_EAT,Boar.class, Sheep.class,0);
        Utils.addElement(PROBABILITY_EAT,Boar.class, Bull.class,0);
        Utils.addElement(PROBABILITY_EAT,Boar.class, Duck.class,0);
        Utils.addElement(PROBABILITY_EAT,Boar.class, Caterpillar.class,90);
        Utils.addElement(PROBABILITY_EAT,Boar.class, Plant.class,100);

        Utils.addElement(PROBABILITY_EAT,Bull.class, Wolf.class,0);
        Utils.addElement(PROBABILITY_EAT,Bull.class, Snake.class,0);
        Utils.addElement(PROBABILITY_EAT,Bull.class, Fox.class,0);
        Utils.addElement(PROBABILITY_EAT,Bull.class, Bear.class,0);
        Utils.addElement(PROBABILITY_EAT,Bull.class, Eagle.class,0);
        Utils.addElement(PROBABILITY_EAT,Bull.class, Horse.class,0);
        Utils.addElement(PROBABILITY_EAT,Bull.class, Deer.class,0);
        Utils.addElement(PROBABILITY_EAT,Bull.class, Rabbit.class,0);
        Utils.addElement(PROBABILITY_EAT,Bull.class, Mouse.class,0);
        Utils.addElement(PROBABILITY_EAT,Bull.class, Goat.class,0);
        Utils.addElement(PROBABILITY_EAT,Bull.class, Sheep.class,0);
        Utils.addElement(PROBABILITY_EAT,Bull.class, Boar.class,0);
        Utils.addElement(PROBABILITY_EAT,Bull.class, Duck.class,0);
        Utils.addElement(PROBABILITY_EAT,Bull.class, Caterpillar.class,0);
        Utils.addElement(PROBABILITY_EAT,Bull.class, Plant.class,100);

        Utils.addElement(PROBABILITY_EAT,Duck.class, Wolf.class,0);
        Utils.addElement(PROBABILITY_EAT,Duck.class, Snake.class,0);
        Utils.addElement(PROBABILITY_EAT,Duck.class, Fox.class,0);
        Utils.addElement(PROBABILITY_EAT,Duck.class, Bear.class,0);
        Utils.addElement(PROBABILITY_EAT,Duck.class, Eagle.class,0);
        Utils.addElement(PROBABILITY_EAT,Duck.class, Horse.class,0);
        Utils.addElement(PROBABILITY_EAT,Duck.class, Deer.class,0);
        Utils.addElement(PROBABILITY_EAT,Duck.class, Rabbit.class,0);
        Utils.addElement(PROBABILITY_EAT,Duck.class, Mouse.class,0);
        Utils.addElement(PROBABILITY_EAT,Duck.class, Goat.class,0);
        Utils.addElement(PROBABILITY_EAT,Duck.class, Sheep.class,0);
        Utils.addElement(PROBABILITY_EAT,Duck.class, Boar.class,0);
        Utils.addElement(PROBABILITY_EAT,Duck.class, Bull.class,0);
        Utils.addElement(PROBABILITY_EAT,Duck.class, Caterpillar.class,90);
        Utils.addElement(PROBABILITY_EAT,Duck.class, Plant.class,100);

        Utils.addElement(PROBABILITY_EAT,Caterpillar.class, Wolf.class,0);
        Utils.addElement(PROBABILITY_EAT,Caterpillar.class, Snake.class,0);
        Utils.addElement(PROBABILITY_EAT,Caterpillar.class, Fox.class,0);
        Utils.addElement(PROBABILITY_EAT,Caterpillar.class, Bear.class,0);
        Utils.addElement(PROBABILITY_EAT,Caterpillar.class, Eagle.class,0);
        Utils.addElement(PROBABILITY_EAT,Caterpillar.class, Horse.class,0);
        Utils.addElement(PROBABILITY_EAT,Caterpillar.class, Deer.class,0);
        Utils.addElement(PROBABILITY_EAT,Caterpillar.class, Rabbit.class,0);
        Utils.addElement(PROBABILITY_EAT,Caterpillar.class, Mouse.class,0);
        Utils.addElement(PROBABILITY_EAT,Caterpillar.class, Goat.class,0);
        Utils.addElement(PROBABILITY_EAT,Caterpillar.class, Sheep.class,0);
        Utils.addElement(PROBABILITY_EAT,Caterpillar.class, Boar.class,0);
        Utils.addElement(PROBABILITY_EAT,Caterpillar.class, Bull.class,0);
        Utils.addElement(PROBABILITY_EAT,Caterpillar.class, Duck.class,0);
        Utils.addElement(PROBABILITY_EAT,Caterpillar.class, Plant.class,100);

        ORGANISMS_PARAMETERS.put(Wolf.class,new float[]{50,30,3,8});
        ORGANISMS_PARAMETERS.put(Snake.class,new float[]{15,30,1,3});
        ORGANISMS_PARAMETERS.put(Fox.class,new float[]{8,30,2,2});
        ORGANISMS_PARAMETERS.put(Bear.class,new float[]{500,5,2,80});
        ORGANISMS_PARAMETERS.put(Eagle.class,new float[]{6,20,3,1});
        ORGANISMS_PARAMETERS.put(Horse.class,new float[]{400,20,4,60});
        ORGANISMS_PARAMETERS.put(Deer.class,new float[]{300,20,4,50});
        ORGANISMS_PARAMETERS.put(Rabbit.class,new float[]{2,150,2,0.45F});
        ORGANISMS_PARAMETERS.put(Mouse.class,new float[]{0.05F,500,1,0.01F});
        ORGANISMS_PARAMETERS.put(Goat.class,new float[]{60,140,3,10});
        ORGANISMS_PARAMETERS.put(Sheep.class,new float[]{70,140,3,15});
        ORGANISMS_PARAMETERS.put(Boar.class,new float[]{400,50,2,50});
        ORGANISMS_PARAMETERS.put(Bull.class,new float[]{700,10,3,100});
        ORGANISMS_PARAMETERS.put(Duck.class,new float[]{1,200,4,0.15F});
        ORGANISMS_PARAMETERS.put(Caterpillar.class,new float[]{0.01F,1000,0,0});
        ORGANISMS_PARAMETERS.put(Plant.class,new float[]{1,200,Float.NaN,Float.NaN});

        EMOJI.put(Wolf.class,"\uD83D\uDC3A");
        EMOJI.put(Snake.class,"\uD83D\uDC0D");
        EMOJI.put(Fox.class,"\uD83E\uDD8A");
        EMOJI.put(Bear.class,"\uD83D\uDC3B");
        EMOJI.put(Eagle.class,"\uD83E\uDD85");
        EMOJI.put(Horse.class,"\uD83D\uDC0E");
        EMOJI.put(Deer.class,"\uD83E\uDD8C");
        EMOJI.put(Rabbit.class,"\uD83D\uDC07");
        EMOJI.put(Mouse.class,"\uD83D\uDC01");
        EMOJI.put(Goat.class,"\uD83D\uDC10");
        EMOJI.put(Sheep.class,"\uD83D\uDC11");
        EMOJI.put(Boar.class,"\uD83D\uDC17");
        EMOJI.put(Bull.class,"\uD83D\uDC03");
        EMOJI.put(Duck.class,"\uD83E\uDD86");
        EMOJI.put(Caterpillar.class,"\uD83D\uDC1B");
        EMOJI.put(Plant.class,"\uD83C\uDF31");

    }
}
