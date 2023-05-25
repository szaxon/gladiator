package com.codecool.gladiator.logic;

import com.codecool.gladiator.data.gladiator.Gladiator;
import com.codecool.gladiator.logic.tournament.Tournament;
import com.codecool.gladiator.view.ConsoleView;
import com.codecool.gladiator.view.DisplayColoredText;
import com.codecool.gladiator.view.Gameplay;
import com.codecool.gladiator.view.Viewable;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private List<List<Gladiator>> gladiatorGroups;
    private Gameplay gameplay = new Gameplay();
    private Viewable viewable = new ConsoleView();
    private Combat combat = new Combat();
    private Tournament tournament = new Tournament();
    Colosseum colosseum = new Colosseum();
    public void run() {
        new DisplayColoredText().displayImage();
        gladiatorGroups = colosseum.generateGladiatorGroups(4, null);
        for (List<Gladiator> gladiatorGroup : gladiatorGroups) {
            tournament.addAll(gladiatorGroup);
        }
        simulateFight(new ArrayList<>(gladiatorGroups));
    }

    private Gladiator simulateFight(List<List<Gladiator>> gladiatorGroups) {
        boolean winner = false;
        Gladiator winnerGladiator = null;
        List<List<Gladiator>> currentGroups = new ArrayList<>(gladiatorGroups);
        while(!winner){
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
            if(survived.size() == 1){
                winner = true;
                winnerGladiator = survived.get(0);
            } else {
                currentGroups = colosseum.generateGladiatorGroups(0, survived);
            }
        }
        return winnerGladiator;
    }
}
