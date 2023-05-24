package com.codecool.gladiator.logic.tournament;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LaciTree {
    private int lengthOfTree;

    //private String[] tree;
    public void tree(int amountOfGladiators) {
        lengthOfTree = amountOfGladiators * 2 - 1;
        List<String> tree = new ArrayList<>();
        for (int i = 0; i < lengthOfTree; i++) {
            tree.add("");
        }
        //populate
        for (int i = 0; i < lengthOfTree; i += 2) {
            tree.set(i, "player");
        }
        int spaces = 6;
        int step = 1;
        int line = 4;
        for (int y = 1; y < 4; y++){
            for (int i = step; i < lengthOfTree; i += line) {
                tree.set(i, tree.get(i) + makeSpaces(spaces * y)+"player");
            }
            step += 2;
            line = line += 4;
        }
        /*
        for (int i = 3; i < lengthOfTree; i += 8) {
            tree.set(i, tree.get(i) + "            player");
        }*/
        tree.forEach(System.out::println);
    }
    public String makeSpaces(int amount){
        return " ".repeat(amount);
    }
}
