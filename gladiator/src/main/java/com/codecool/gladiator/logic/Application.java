package com.codecool.gladiator.logic;

import com.codecool.gladiator.data.gladiator.Gladiator;
import com.codecool.gladiator.logic.tournament.Tournament;
import com.codecool.gladiator.ui.ConsoleView;
import com.codecool.gladiator.ui.DisplayColoredText;
import com.codecool.gladiator.ui.Gameplay;
import com.codecool.gladiator.ui.Viewable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    private List<List<Gladiator>> gladiatorGroups;
    private Gameplay gameplay = new Gameplay();
    private Viewable viewable = new ConsoleView();
    private Combat combat = new Combat();
    private Tournament tournament = new Tournament();
    Colosseum colosseum = new Colosseum();

    public void run() {
        int amountOfGladiators = getNumberOfGladiator();

        tournament.createTree(amountOfGladiators);
        new DisplayColoredText().displayImage();
        gladiatorGroups = colosseum.generateGladiatorGroups(amountOfGladiators, null);
        for (List<Gladiator> gladiatorGroup : gladiatorGroups) {
            tournament.addAll(gladiatorGroup);
        }
        simulateFight(new ArrayList<>(gladiatorGroups));
    }

    private int getNumberOfGladiator() {
        viewable.display("please input a number, which is a power of two");
        return viewable.getAPowerToTwo(new Scanner(System.in).nextDouble());
    }

    private Gladiator simulateFight(List<List<Gladiator>> gladiatorGroups) {
        boolean winner = false;
        Gladiator winnerGladiator = null;
        List<List<Gladiator>> currentGroups = new ArrayList<>(gladiatorGroups);
        while (!winner) {
            List<Gladiator> survived = new ArrayList<>();
            //display tree
            viewable.display(tournament.returnTree());
            gameplay.pressEnter();
            //fight
            for (List<Gladiator> gladiatorGroup : currentGroups) {
                Gladiator winnerOfRound = combat.simulate(gladiatorGroup);
                tournament.add(winnerOfRound);
                survived.add(winnerOfRound);
                System.out.println(tournament.returnTree());
                gameplay.pressEnter();
            }
            if (survived.size() == 1) {
                winner = true;
                winnerGladiator = survived.get(0);
            } else {
                currentGroups = colosseum.generateGladiatorGroups(0, survived);
            }
        }
        return winnerGladiator;
    }
}
