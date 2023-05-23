package com.codecool.gladiator.data.gladiator;

import com.codecool.gladiator.data.StatisticMultiplier;

public abstract class Gladiator {

    private final GladiatorName gladiatorName;

    private GladiatorType gladiatorType;

    private StatisticMultiplier hpMultiplier;

    private double hp;

    private StatisticMultiplier spMultiplier;

    private double sp;

    private StatisticMultiplier dexMultiplier;

    private double dex;

    private int health;

    private int level;

    public Gladiator(GladiatorName gladiatorName, GladiatorType gladiatorType) {
        this.gladiatorName = gladiatorName;
        this.gladiatorType = gladiatorType;
    }

    public String getFullName() {
        return gladiatorType.toString() + gladiatorName.toString();
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
        level += 1;
    }
}


//        Within the Gladiator class, there are three protected functions that return multipliers for the HP, SP,
//        and DEX statistics, respectively. The functions MUST be implemented by every subclass of Gladiator.
//
//        Within the Gladiator class, there are three public functions that return the maximum available values of the gladiator's statistics (HP, SP, and DEX, respectively). The available value is calculated by the maximumStatistic = baseStatistic × statisticMultiplier × level formula.
//
//        Every gladiator has a current health value. This decreases during a combat when receiving hits from the enemy. When the value goes below zero, the gladiator dies.
//
//        There is a Swordsman subclass of Gladiator. Its multipliers are: HP: medium, SP: medium, DEX: medium
//
//        There is an Archer subclass of Gladiator. Its multipliers are: HP: medium, SP: medium, DEX: high.
//
//        There is an Assassin subclass of Gladiator. Its multipliers are: HP: low, SP: high, DEX: high.
//
//        There is a Brutal subclass of Gladiator. Its multipliers are: HP: high, SP: high, DEX: low.

