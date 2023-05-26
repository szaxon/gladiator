package com.codecool.gladiator.logic.tournament;

import com.codecool.gladiator.data.gladiator.Gladiator;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private int stageOfTournament = 0;
    private final List<String> startingPoints = new ArrayList<>();
    private String combatTree;
    private int playerNum = 1;

    public void createTree(int num) {
        int amountOfPlayers = num;
        combatTree = new Tree().drawTree(amountOfPlayers);
        while (amountOfPlayers != 0) {

            for (int i = 0; i < amountOfPlayers; i++) {
                startingPoints.add("player" + playerNum);
            }
            amountOfPlayers = amountOfPlayers / 2;
            playerNum += 1;
        }
    }

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
