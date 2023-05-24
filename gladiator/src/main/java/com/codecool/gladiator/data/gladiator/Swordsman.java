package com.codecool.gladiator.data.gladiator;

import com.codecool.gladiator.data.StatisticMultiplier;

public class Swordsman extends Gladiator{
    public Swordsman(GladiatorName gladiatorName, GladiatorType gladiatorType,int level, double hp, double sp, double dex) {
        super(gladiatorName, gladiatorType, level);
        maxDex = dex * StatisticMultiplier.MEDIUM.getMultiplier() * level;
        maxHp = hp * StatisticMultiplier.MEDIUM.getMultiplier()* level;
        maxSp = sp * StatisticMultiplier.MEDIUM.getMultiplier()* level;
    }
    @Override
    public String hitMessage(double damage) {
        return this.getFullName() + "'s sword cuts off the enemy's legs, dealing " + damage + "damage";
    }

    @Override
    public String missMessage() {
        return this.getFullName() + "'s sword brakes while attacking";
    }

}
