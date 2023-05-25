package com.codecool.gladiator.view;

public class Tree {

    public String drawTree(int amountOfGladiators) {

        StringBuilder tree = new StringBuilder();
        String[] table = new String[amountOfGladiators * 2 - 1];

        String nameSuf = "⏐–––––player";
        String namePref = "–––––⏐";

        int treeDepth = calculateAmountOfLevels(amountOfGladiators);
        int numberOfSpaces = 1;
        int step = 2;
        int j = 1;

        for (int i = 0; i < treeDepth; i++) {
            while (j <= table.length) {
                table[j - 1] = makeSpaces(numberOfSpaces) + nameSuf + (i+1) + namePref ;
                j += step;
            }
            numberOfSpaces += 18;
            step *= 2;
            j =  step / 2;
        }

        for (String s : table) {
            tree.append(s).append("\n");
        }
        return tree.toString();
    }

    private int calculateAmountOfLevels(int number) {
        int result = 0;
        int copyOfNumber = number;

        while (copyOfNumber >= 1) {
            copyOfNumber /= 2;
            result++;
        }
        return result;
    }

    private String makeSpaces(int amount) {
        return " ".repeat(amount);
    }
}
