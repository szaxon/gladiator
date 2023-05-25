package com.codecool.gladiator.data.gladiator;

import com.codecool.gladiator.data.StatisticMultiplier;

public class Assassin extends Gladiator {

    public Assassin(GladiatorName gladiatorName, GladiatorType gladiatorType,int level, double hp, double sp, double dex) {
        super(gladiatorName, gladiatorType, level);
        maxDex = dex * StatisticMultiplier.HIGH.getMultiplier() * level;
        maxHp = hp * StatisticMultiplier.LOW.getMultiplier() * level;
        maxSp = sp * StatisticMultiplier.HIGH.getMultiplier() * level;
        currentHp = maxHp;
    }
}
