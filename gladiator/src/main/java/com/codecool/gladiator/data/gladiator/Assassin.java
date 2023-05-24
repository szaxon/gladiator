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
    @Override
    public String hitMessage(double damage) {
        return this.getFullName() + " sneaks and jumps and start biting, dealing " + (int) damage + " damage";
    }

    @Override
    public String missMessage() {
        return this.getFullName() + " gives himself away with a loud noise and runs away";
    }
}
