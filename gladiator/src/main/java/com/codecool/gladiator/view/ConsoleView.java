package com.codecool.gladiator.view;

import java.util.Scanner;

public class ConsoleView implements Viewable {

    private Scanner sc = new Scanner(System.in);

    @Override
    public void display(String message) {
        System.out.println(message);
    }

    @Override
    public int getNumberBetween(int num) {
        int number = 0;
        int x = (int) Math.sqrt(num);
        while (Math.pow(x,2) != num) {
            display("the number has to be a squared form of 2");
            number = sc.nextInt();
        }
        return number;
    }
}
