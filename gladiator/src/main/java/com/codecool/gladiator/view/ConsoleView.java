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
        while ((int)(Math.ceil((Math.log(number) / Math.log(2))))
                == (int)(Math.floor(((Math.log(number) / Math.log(2)))))) {
            display("the number has to be a power form of 2");
            number = sc.nextInt();
        }
        return number;
    }
}
