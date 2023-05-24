package com.codecool.gladiator.logic.tournament;

import com.codecool.gladiator.data.gladiator.Gladiator;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private List<Gladiator> firstGroup;
    private List<Gladiator> secondGroup;
    private List<Gladiator> finalGroup;
    private List<String> startingPoints = new ArrayList<>(List.of("f1", "f2", "f3", "f4", "w1", "w2", "W"));

    private String combatTree = """
            f1-----
            |      |--------w1
            f2-----          |
                             |
                             |----------W
                             |
            f3-----          |
                   |--------w2
            f4-----""";

    public void add(Gladiator gladiator) {
        combatTree = combatTree.replace(startingPoints.get(0), gladiator.getGladiatorName());
        startingPoints.remove(0);
    }

    public void allAll(List<Gladiator> allGladiators) {
        for (int i = 0; i < allGladiators.size(); i++) {
            combatTree = combatTree.replace(startingPoints.get(i), allGladiators.get(i).getGladiatorName());
            startingPoints.remove(i);
        }
    }

    public String returnTree() {
        return combatTree;
    }
}
