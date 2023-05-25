package com.codecool.gladiator.view;

import java.util.Scanner;

public class Gameplay {

    public void pressEnter(){
        System.out.println("Press enter to continue");
        new Scanner(System.in).nextLine();
    }
    public int inputGladiatorNumber(){
        System.out.println("please input how many gladiators you  want below");
        Scanner scanner = new Scanner(System.in);
        ConsoleView consoleView = new ConsoleView();
        int hehe = consoleView.getNumberBetween(scanner.nextInt());
        return hehe;
    }
}
