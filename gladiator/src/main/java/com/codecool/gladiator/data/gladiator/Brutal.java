package com.codecool.gladiator.data.gladiator;

import com.codecool.gladiator.data.StatisticMultiplier;

public class Brutal extends Gladiator {

    public Brutal(GladiatorName gladiatorName, GladiatorType gladiatorType, int level, double hp, double sp, double dex) {
        super(gladiatorName, gladiatorType, level);
        maxDex = dex * StatisticMultiplier.LOW.getMultiplier() * level;
        maxHp = hp * StatisticMultiplier.HIGH.getMultiplier() * level;
        maxSp = sp * StatisticMultiplier.HIGH.getMultiplier() * level;
        currentHp = maxHp;
    }

}
