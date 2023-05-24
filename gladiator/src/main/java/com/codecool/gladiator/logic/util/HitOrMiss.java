package com.codecool.gladiator.logic.util;

import com.codecool.gladiator.data.gladiator.Gladiator;
import com.codecool.gladiator.logic.RandomNumberGenerator;

public class HitOrMiss {
    public boolean hitOrMiss(Gladiator attacker, Gladiator defender){
        double attackerDex = attacker.getMaxDex();
        double defenderDex = defender.getMaxDex();
        int chanceOfHitting = (int)Math.min(attackerDex, defenderDex);
        int[] numbers = new int[100];
        for (int i = 0; i < chanceOfHitting; i++) {
            numbers[i] = 1;
        }
        for (int i = chanceOfHitting; i < 100-chanceOfHitting; i++) {
            numbers[i] = 0;
        }
        RandomNumberGenerator random = new RandomNumberGenerator();
        int randomIndex = random.generateRandom(0,100);
        return numbers[randomIndex] == 1;
    }
}
