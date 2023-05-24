package com.codecool.gladiator.logic;

import com.codecool.gladiator.data.gladiator.Gladiator;
import com.codecool.gladiator.logic.util.HitOrMiss;
import com.codecool.gladiator.view.DisplayColoredText;
import com.codecool.gladiator.view.Viewable;

import java.util.List;

public class Combat {
    private Gladiator firstAttacker;
    private Gladiator secondAttacker;
    //private final List<String> combatLog = new ArrayList<>();
    //private final Viewable viewable = new ConsoleView();
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    private final DisplayColoredText display = new DisplayColoredText();

    public Gladiator simulate(List<Gladiator> gladiatorPair) {
        if (gladiatorPair.get(0) == null) return gladiatorPair.get(1);
        else if (gladiatorPair.get(1) == null) return gladiatorPair.get(0);
        else if (gladiatorPair.get(0) == null && gladiatorPair.get(1) == null) return null;

        selectOrderOfAttackers(gladiatorPair);

        Colosseum colosseum = new Colosseum();
        display.displayWhiteText(colosseum.starterMessage(firstAttacker, secondAttacker));

        while (!firstAttacker.isDefeated() || !secondAttacker.isDefeated()) {
            hitOrMiss(firstAttacker, secondAttacker);
            if (firstAttacker.isDefeated()) {
                display.displayBlueText(firstAttacker.getFullName() + " has died, " + secondAttacker.getFullName() + " wins!");
                return secondAttacker;
            } else if (secondAttacker.isDefeated()) {
                display.displayBlueText(secondAttacker.getFullName() + " has died, " + firstAttacker.getFullName() + " wins!");
                return firstAttacker;
            }
            hitOrMiss(secondAttacker, firstAttacker);
        }
        return null;
    }

    private void selectOrderOfAttackers(List<Gladiator> gladiatorPair){
        RandomNumberGenerator random = new RandomNumberGenerator();
        int firstAttackerIndex = random.generateRandom(0, 1);
        int secondAttackerIndex = firstAttackerIndex == 1 ? 0 : 1;
        firstAttacker = gladiatorPair.get(firstAttackerIndex);
        secondAttacker = gladiatorPair.get(secondAttackerIndex);
    }

    private void hitOrMiss(Gladiator attacker, Gladiator defender) {
        HitOrMiss hitOrMiss = new HitOrMiss();
        boolean hit = hitOrMiss.hitOrMiss(attacker, defender);
        if (hit) {
            double damage = calculateDamage(attacker);

            defender.decreaseHp(damage);
            display.displayGreenText(attacker.hitMessage(damage));
        } else display.displayYellowText(attacker.missMessage());
    }

    private double calculateDamage(Gladiator attacker) {
        double rangeStart = 0.1;
        double rangeEnd = 0.5;

        double multiplier = randomNumberGenerator.generateRandomDouble(rangeStart, rangeEnd);
        return attacker.getMaxSp() * multiplier;
    }

//    public List<String> getCombatLog() {
//        return combatLog;
//   }

//    private void addToCombatLog(String message) {
//        combatLog.add(message);
//    }


}
