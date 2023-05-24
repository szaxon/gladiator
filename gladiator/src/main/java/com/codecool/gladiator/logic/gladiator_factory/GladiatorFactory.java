package com.codecool.gladiator.logic.gladiator_factory;

import com.codecool.gladiator.data.gladiator.*;
import com.codecool.gladiator.logic.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
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
    private static final List<GladiatorName> gladiatorNames = Arrays.stream(GladiatorName.values()).toList();
    private static final List<GladiatorType> gladiatorTypes = Arrays.stream(GladiatorType.values()).toList();
    private final List<Gladiator> creatorList = new ArrayList<>();
    public GladiatorFactory() {
        generateRandomGladiator();
        creatorList.add(createArcher(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX));
        creatorList.add(createAssassin(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX));
        creatorList.add(createBrutal(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX));
        creatorList.add(createSwordsman(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX));
        creatorList.add(createSwordsman(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX));
    }

    public Gladiator generateRandomGladiator() {
        randomLvl = randomNumberGenerator.generateRandom(LEVEL_RANGE_START, LEVEL_RANGE_END);
        randomHP = randomNumberGenerator.generateRandom(STATISTICS_RANGE_START, STATISTICS_RANGE_END);
        randomSP = randomNumberGenerator.generateRandom(STATISTICS_RANGE_START, STATISTICS_RANGE_END);
        randomDEX = randomNumberGenerator.generateRandom(STATISTICS_RANGE_START, STATISTICS_RANGE_END);
        randomName = gladiatorNames.get(randomNumberGenerator.generateRandom(0, gladiatorNames.size()));
        randomType = gladiatorTypes.get(randomNumberGenerator.generateRandom(0, gladiatorTypes.size()));
        return creatorList.get(randomNumberGenerator.generateRandom(0, creatorList.size()));
    }

    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    private Archer createArcher(GladiatorName randomName, GladiatorType randomType, int hp, int sp, int dex, int lvl) {
        return new Archer(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX);
    }

    private Assassin createAssassin(GladiatorName randomName, GladiatorType randomType, int hp, int sp, int dex, int lvl) {
        return new Assassin(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX);
    }

    private Brutal createBrutal(GladiatorName randomName, GladiatorType randomType, int hp, int sp, int dex, int lvl) {
        return new Brutal(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX);
    }

    private Swordsman createSwordsman(GladiatorName randomName, GladiatorType randomType, int hp, int sp, int dex, int lvl) {
        return new Swordsman(randomName, randomType, randomLvl, randomHP, randomSP, randomDEX);
    }
}
