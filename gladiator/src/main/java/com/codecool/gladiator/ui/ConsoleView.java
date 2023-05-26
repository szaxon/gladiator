package com.codecool.gladiator.ui;

import java.util.Scanner;

public class ConsoleView implements Viewable {

    private final Scanner sc = new Scanner(System.in);

    @Override
    public void display(String message) {
        System.out.println(message);
    }

    @Override
    public int getAPowerToTwo(double num) {
        double input = num;

        Double compareNumber = check(num, input);
        if (compareNumber == num) {
            return (int)num;
        } else {
            do {
                display("the number has to be a power of 2");
                input = sc.nextInt();
                return getAPowerToTwo(input);
            } while (true);
        }
    }
    private static Double check(double num, double input) {
        while (input % 2 == 0 || input == 1) {
            if (input == 1) {
                return num;
            }
            input = input / 2;
        }
        return 0d;
    }
}
