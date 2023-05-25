package com.codecool.gladiator.data.gladiator;

import com.codecool.gladiator.data.StatisticMultiplier;

public class Archer extends Gladiator {
    public Archer(GladiatorName gladiatorName, GladiatorType gladiatorType, int level, double hp, double sp, double dex) {
        super(gladiatorName, gladiatorType, level);
        maxDex = dex * StatisticMultiplier.HIGH.getMultiplier() * level;
        maxHp = hp * StatisticMultiplier.MEDIUM.getMultiplier() * level;
        maxSp = sp * StatisticMultiplier.MEDIUM.getMultiplier() * level;
        currentHp = maxHp;

    }
}
