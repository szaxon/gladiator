package com.codecool.gladiator;

import com.codecool.gladiator.logic.GladiatorFactory;
import com.codecool.gladiator.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        GladiatorFactory gladiatorFactory = new GladiatorFactory();
        gladiatorFactory.generateRandomGladiator();

        ConsoleView consoleView = new ConsoleView();

        consoleView.getNumberBetween(2, 11);

    }
}
