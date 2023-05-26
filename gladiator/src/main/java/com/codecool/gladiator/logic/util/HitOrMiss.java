package com.codecool.gladiator.logic.util;

import com.codecool.gladiator.data.gladiator.Gladiator;
import com.codecool.gladiator.logic.RandomNumberGenerator;

import java.util.Arrays;

public class HitOrMiss {
    public boolean hitOrMiss(Gladiator attacker, Gladiator defender) {
        double attackerDex = attacker.getMaxDex();
        double defenderDex = defender.getMaxDex();

        if (attackerDex > 100) attackerDex = 100;
        else if (attackerDex < 10) attackerDex = 10;

        if (defenderDex > 100) defenderDex = 100;
        else if (defenderDex < 10) defenderDex = 10;

        int chanceOfHitting = (int) Math.min(attackerDex, defenderDex);

        RandomNumberGenerator random = new RandomNumberGenerator();
        int randomNumber = random.generateRandom(0, 100);

        return randomNumber <= chanceOfHitting;
    }
}
