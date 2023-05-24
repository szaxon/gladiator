package com.codecool.gladiator;

import com.codecool.gladiator.data.gladiator.Archer;
import com.codecool.gladiator.data.gladiator.Gladiator;
import com.codecool.gladiator.logic.Colosseum;
import com.codecool.gladiator.logic.Combat;
import com.codecool.gladiator.logic.tournament.Tournament;
import com.codecool.gladiator.view.ConsoleView;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ConsoleView consoleView = new ConsoleView();

        //consoleView.getNumberBetween(2, 11);

        Colosseum colosseum = new Colosseum();
        List<Gladiator> gladiatorList  = colosseum.generateGladiators(4);

        colosseum.splitGladiatorsIntoPairs(gladiatorList);

        Tournament tournament = new Tournament();
        tournament.addAll(gladiatorList);
        System.out.println(tournament.returnTree());

        Combat combat = new Combat();













    }
}
