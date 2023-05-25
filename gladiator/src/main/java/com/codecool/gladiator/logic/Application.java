package com.codecool.gladiator.logic;

import com.codecool.gladiator.data.gladiator.Gladiator;
import com.codecool.gladiator.logic.tournament.Tournament;
import com.codecool.gladiator.ui.ConsoleView;
import com.codecool.gladiator.ui.DisplayColoredText;
import com.codecool.gladiator.ui.Gameplay;
import com.codecool.gladiator.ui.Viewable;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private final Gameplay gameplay = new Gameplay();
    private final Viewable viewable = new ConsoleView();
    private final Combat combat = new Combat();
    private final Tournament tournament = new Tournament();
    Colosseum colosseum = new Colosseum();
    public void run() {
        int amountOfGladiators = gameplay.inputGladiatorNumber();
        tournament.createTree(amountOfGladiators);
        new DisplayColoredText().displayImage();
        List<List<Gladiator>> gladiatorGroups = colosseum.generateGladiatorGroups(amountOfGladiators, null);
        for (List<Gladiator> gladiatorGroup : gladiatorGroups) {
            tournament.addAll(gladiatorGroup);
        }
        simulateTournament(new ArrayList<>(gladiatorGroups));
    }

    private void simulateTournament(List<List<Gladiator>> gladiatorGroups) {
        boolean winner = false;
        List<List<Gladiator>> currentGroups = new ArrayList<>(gladiatorGroups);
        //tournament runs while we get a winner
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
                viewable.display(tournament.returnTree());
                gameplay.pressEnter();
            }
            //check for winner
            if(survived.size() == 1){
                winner = true;
            } else {
                currentGroups = colosseum.generateGladiatorGroups(0, survived);
            }
        }
    }
}
