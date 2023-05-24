package com.codecool.gladiator.logic.util;

import com.codecool.gladiator.data.gladiator.Gladiator;
import com.codecool.gladiator.logic.RandomNumberGenerator;

import java.util.Arrays;

public class HitOrMiss {
    public boolean hitOrMiss(Gladiator attacker, Gladiator defender){
        double attackerDex = attacker.getMaxDex();
        double defenderDex = defender.getMaxDex();

        int chanceOfHitting = (int)Math.min(attackerDex, defenderDex);

        chanceOfHitting = 54;

        RandomNumberGenerator random = new RandomNumberGenerator();
        int randomNumber = random.generateRandom(0,100);

        return randomNumber <= chanceOfHitting;
    }
}
