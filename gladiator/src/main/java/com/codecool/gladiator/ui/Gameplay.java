package com.codecool.gladiator.ui;

import java.util.Scanner;

public class Gameplay {

    public void pressEnter(){
        System.out.println("Press enter to continue");
        new Scanner(System.in).nextLine();
    }
    public int inputGladiatorNumber(){
        System.out.println("please input how many gladiators you  want below");
        return new Scanner(System.in).nextInt();
    }
}
