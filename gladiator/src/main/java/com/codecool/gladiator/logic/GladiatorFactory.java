package com.codecool.gladiator.logic;

import com.codecool.gladiator.data.gladiator.*;

import java.util.List;

public class GladiatorFactory {
    private static final int STATISTICS_RANGE_START = 25;
    private static final int STATISTICS_RANGE_END = 100;
    private static final int LEVEL_RANGE_START = 1;
    private static final int LEVEL_RANGE_END = 5;
    private int randomLvl;
    private int randomHP;
    private int randomSP;
    private int randomDEX;
    private GladiatorName randomName;
    private GladiatorType randomType;
    private static final GladiatorName[] gladiatorNames = GladiatorName.values();
    private static final GladiatorType[] gladiatorTypes = GladiatorType.values();
    private final List<Gladiator> creatorList = List.of(
            createArcher(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX),
            createAssassin(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX),
            createBrutal(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX),
            createSwordsman(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX),
            createSwordsman(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX)
    );
    private final RandomNumberGenerator randomNumberGenerator= new RandomNumberGenerator();
    public Gladiator generateRandomGladiator() {
       randomLvl = randomNumberGenerator.generateRandom(LEVEL_RANGE_START, LEVEL_RANGE_END);
       randomHP = randomNumberGenerator.generateRandom(STATISTICS_RANGE_START, STATISTICS_RANGE_END);
       randomSP = randomNumberGenerator.generateRandom(STATISTICS_RANGE_START, STATISTICS_RANGE_END);
       randomDEX = randomNumberGenerator.generateRandom(STATISTICS_RANGE_START, STATISTICS_RANGE_END);
       randomName = gladiatorNames[randomNumberGenerator.generateRandom(0,gladiatorNames.length)];
       randomType = gladiatorTypes[randomNumberGenerator.generateRandom(0,gladiatorTypes.length)];

       return creatorList.get(randomNumberGenerator.generateRandom(0,creatorList.size()));
    }

    private Archer createArcher(GladiatorName randomName,GladiatorType randomType, int hp, int sp, int dex, int lvl){
        return new Archer(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX);
    }
    private Assassin createAssassin(GladiatorName randomName,GladiatorType randomType, int hp, int sp, int dex, int lvl){
        return new Assassin(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX);
    }
    private Brutal createBrutal(GladiatorName randomName,GladiatorType randomType, int hp, int sp, int dex, int lvl){
        return new Brutal(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX);
    }
    private Swordsman createSwordsman(GladiatorName randomName,GladiatorType randomType, int hp, int sp, int dex, int lvl){
        return new Swordsman(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX);
    }
}
