package com.codecool.gladiator.data.gladiator;

import com.codecool.gladiator.data.StatisticMultiplier;

public abstract class Gladiator {

    private final GladiatorName gladiatorName;
    private final GladiatorType gladiatorType;
    protected double maxHp;
    protected double maxSp;
    protected double maxDex;
    protected double currentHp;

    protected int level;

    public Gladiator(GladiatorName gladiatorName, GladiatorType gladiatorType, int level) {
        this.gladiatorName = gladiatorName;
        this.gladiatorType = gladiatorType;
        this.level = level;
    }
    public String getFullName() {
        return gladiatorType.toString().charAt(0)  + gladiatorType.toString().substring(1).toLowerCase()+ " " +gladiatorName.toString();
    }

    public void levelUp() {
        level += 1;
    }
    public double getMaxSp(){return maxSp;}
    public double getMaxDex() {return maxDex;}
    public double getMaxHp() {return maxHp;}
    public void decreaseHp(double damage){currentHp -= damage;}
    public double getCurrentHp() {return currentHp;}
    public boolean isDefeated(){return currentHp < 0;}

    public String getGladiatorName() {return gladiatorName.toString();}
    public abstract String hitMessage(double damage);
    public abstract String missMessage();

    public int getLevel() {
        return level;
    }
}
