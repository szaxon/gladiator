package com.codecool.gladiator.logic;

import com.codecool.gladiator.data.gladiator.Gladiator;
import com.codecool.gladiator.logic.gladiator_factory.GladiatorFactory;
import com.codecool.gladiator.view.ConsoleView;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Colosseum {

    public List<List<Gladiator>> generateGladiatorGroups(int numberOfGladiators, List<Gladiator> gladiators) {
        if(gladiators == null){
            List<Gladiator> gladiatorList = new ArrayList<>();
            for (int i = 0; i < numberOfGladiators; i++) {
                gladiatorList.add(new GladiatorFactory().getGladiator());
            }
            return splitGladiatorsIntoPairs(gladiatorList);
        } else {
            return splitGladiatorsIntoPairs(gladiators);
        }
    }

    private List<List<Gladiator>> splitGladiatorsIntoPairs(List<Gladiator> gladiatorList) {
        List<List<Gladiator>> fightGroups = new ArrayList<>();
        for (int i = 0; i < gladiatorList.size(); i = i + 2) {
            fightGroups.add(new ArrayList<>(List.of(gladiatorList.get(i), gladiatorList.get(i + 1))));
        }
        return fightGroups;
    }

    public String starterMessage(Gladiator fighter1, Gladiator fighter2) {
        return "Duel " + fighter1.getFullName() + " versus " + fighter2.getFullName() + ":\n" + fighter1.getFullName() +
                " (" + fighter1.getCurrentHp() + "/" + fighter1.getMaxHp() + " HP, " + fighter1.getMaxSp()
                + " SP, " + fighter1.getMaxDex() + " DEX, " + fighter1.getLevel() + " LVL)\n" + fighter2.getFullName() +
                " (" + fighter2.getCurrentHp() + "/" + fighter2.getMaxHp() + " HP, " + fighter2.getMaxSp() + " SP, " +
                fighter2.getMaxDex() + " DEX, " + fighter2.getLevel() + " LVL)\n\n" + "Begin!";
    }
}
