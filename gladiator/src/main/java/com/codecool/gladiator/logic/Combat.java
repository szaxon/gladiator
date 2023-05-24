package com.codecool.gladiator.logic;

import com.codecool.gladiator.data.gladiator.Gladiator;
import com.codecool.gladiator.logic.util.HitOrMiss;

import java.util.ArrayList;
import java.util.List;

public class Combat {
    Gladiator firstAttacker;
    Gladiator secondAttacker;
    private final List<String> combatLog = new ArrayList<>();

    public Gladiator simulate(List<Gladiator> gladiatorPair) {
        if (gladiatorPair.get(0) == null) return gladiatorPair.get(1);
        else if (gladiatorPair.get(1) == null) return gladiatorPair.get(0);
        else if (gladiatorPair.get(0) == null && gladiatorPair.get(1) == null) return null;

        selectFirstAttacker(gladiatorPair);
        //display starter message
        while (!firstAttacker.isDefeated() || !secondAttacker.isDefeated()) {
            hitOrMiss(firstAttacker, secondAttacker);
            if (firstAttacker.isDefeated()) {
                addToCombatLog(firstAttacker.getFullName() + " has died, " + secondAttacker.getFullName() + " wins!");
                return secondAttacker;
            } else if (secondAttacker.isDefeated()) {
                addToCombatLog(secondAttacker.getFullName() + " has died, " + firstAttacker.getFullName() + " wins!");
                return firstAttacker;
            }
            hitOrMiss(secondAttacker, firstAttacker);
        }
        return null;
    }

    private void selectFirstAttacker(List<Gladiator> gladiatorPair){
        RandomNumberGenerator random = new RandomNumberGenerator();
        int firstAttackerIndex = random.generateRandom(0, 1);
        int secondAttackerIndex = firstAttackerIndex == 1 ? 1 : 0;
        firstAttacker = gladiatorPair.get(firstAttackerIndex);
        secondAttacker = gladiatorPair.get(secondAttackerIndex);
    }

    private void hitOrMiss(Gladiator attacker, Gladiator defender) {
        HitOrMiss hitOrMiss = new HitOrMiss();
        boolean hit = hitOrMiss.hitOrMiss(attacker, defender);
        if (hit) {
            double damage = calculateDamage(attacker);
            defender.decreaseHp(damage);
            addToCombatLog(attacker.hitMessage(damage));
        } else addToCombatLog(attacker.missMessage());
    }

    private double calculateDamage(Gladiator attacker) {
        double rangeStart = 0.1;
        double rangeEnd = 0.5;
        RandomNumberGenerator random = new RandomNumberGenerator();
        double multiplier = random.generateRandomDouble(rangeStart, rangeEnd);
        return attacker.getMaxSp() * multiplier;
    }

    public List<String> getCombatLog() {
        return combatLog;
    }

    private void addToCombatLog(String message) {
        combatLog.add(message);
    }


}