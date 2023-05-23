package com.codecool.gladiator.view;

import java.util.Scanner;

public class ConsoleView implements Viewable {

    private Scanner sc = new Scanner(System.in);

    @Override
    public void display(String message) {
        System.out.println(message);
    }

    @Override
    public int getNumberBetween(int lowerBoundInclusive, int upperBoundExclusive) {
        int number = 0;
        while (number < lowerBoundInclusive || number > upperBoundExclusive) {
            display("Please give me a number between " + lowerBoundInclusive + " and " + upperBoundExclusive + "!");
            number = sc.nextInt();
        }
        return number;
    }
}
