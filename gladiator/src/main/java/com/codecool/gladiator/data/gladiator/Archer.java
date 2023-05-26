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

    @Override
    public String hitMessage(double damage) {
        return this.getFullName() + "'s shiny long sharp arrow pierces the liver, dealing " + (int) damage + " damage";
    }

    @Override
    public String missMessage() {
        return this.getFullName() + " says not today";
    }

}
