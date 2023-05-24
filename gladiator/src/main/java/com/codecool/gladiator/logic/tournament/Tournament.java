package com.codecool.gladiator.logic.tournament;

import com.codecool.gladiator.data.gladiator.Gladiator;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private List<Gladiator> firstGroup;
    private List<Gladiator> secondGroup;
    private List<Gladiator> finalGroup;
    private int stageOfTournament = 0;
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
        combatTree = combatTree.replaceFirst(startingPoints.get(stageOfTournament), gladiator.getGladiatorName());
        stageOfTournament += 1;
    }

    public void addAll(List<Gladiator> allGladiators) {
        for (int i = 0; i < allGladiators.size(); i++) {
            combatTree = combatTree.replaceFirst(startingPoints.get(stageOfTournament), allGladiators.get(i).getGladiatorName());
            stageOfTournament += 1;
        }
    }

    public String returnTree() {
        return combatTree;
    }
}
