package com.codecool.gladiator;

import com.codecool.gladiator.data.gladiator.*;
import com.codecool.gladiator.logic.Colosseum;
import com.codecool.gladiator.logic.Combat;
import com.codecool.gladiator.logic.tournament.Tournament;
import com.codecool.gladiator.view.ConsoleView;
import com.codecool.gladiator.view.Viewable;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Viewable viewable = new ConsoleView();
        Colosseum colosseum = new Colosseum();
        Combat combat = new Combat();
        Tournament tournament = new Tournament();
        List<List<Gladiator>> gladiatorGroups = colosseum.generateGladiatorGroups(4);

        armin(viewable, combat, tournament, gladiatorGroups);
    }

    private static void armin(Viewable viewable, Combat combat, Tournament tournament, List<List<Gladiator>> gladiatorGroups) {
        for (List<Gladiator> gladiatorGroup : gladiatorGroups) {
            tournament.addAll(gladiatorGroup);
        }

        viewable.display(tournament.returnTree());

        for (List<Gladiator> gladiatorGroup : gladiatorGroups) {
            Gladiator winner = combat.simulate(gladiatorGroup);
            tournament.add(winner);
            System.out.println(tournament.returnTree());
        }
    }
}
