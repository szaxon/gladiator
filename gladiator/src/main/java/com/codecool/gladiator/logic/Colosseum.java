package com.codecool.gladiator.logic;

import com.codecool.gladiator.data.gladiator.Gladiator;
import com.codecool.gladiator.logic.gladiator_factory.GladiatorFactory;
import com.codecool.gladiator.view.ConsoleView;

import java.util.ArrayList;
import java.util.List;

public class Colosseum {
    private List<Gladiator> gladiators = new ArrayList<>();
    private List<Gladiator> firstGroup = new ArrayList<>();
    private List<Gladiator> secondGroup = new ArrayList<>();
    private ConsoleView consoleView = new ConsoleView();
    private final GladiatorFactory gladiatorFactory = new GladiatorFactory();

    public List<Gladiator> generateGladiators(int numberOfGladiators) {
        List<Gladiator> gladiatorSet = new ArrayList<>();
        for (int i = 0; i < numberOfGladiators; i++) {
            gladiatorSet.add(gladiatorFactory.generateRandomGladiator());
        }
        return gladiatorSet;
    }

    public void splitGladiatorsIntoPairs(List<Gladiator> gladiatorList) {
        for (int i = 0; i < gladiatorList.size(); i = i + 2) {
            firstGroup.add(gladiatorList.get(i));
            secondGroup.add(gladiatorList.get(i + 1));
        }
    }

    public String starterMessage(Gladiator fighter1, Gladiator fighter2) {
        return "Duel " + fighter1 + " versus " + fighter2 + ":\n" + fighter1.getFullName() +
                " (" + fighter1.getCurrentHp() + "/" + fighter1.getMaxHp() + " HP, " + fighter1.getMaxSp()
                + " SP, " + fighter1.getMaxDex() + " DEX, " + fighter1.getLevel() + " LVL)\n" + fighter2.getFullName() +
                " (" + fighter2.getCurrentHp() + "/" + fighter2.getMaxHp() + " HP, " + fighter2.getMaxSp() + " SP, " +
                fighter2.getMaxDex() + " DEX, " + fighter2.getLevel() + " LVL)\n\n" + "Begin!";
    }
}
