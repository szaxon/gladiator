package com.codecool.gladiator.logic.tournament;

import java.util.ArrayList;
import java.util.List;

public class CombatTree {
    private String combatTree = "";

    public void createTree(int amountOfGladiators) {
        for (int i = 1; i < amountOfGladiators + 1; i++) {
            if (i % 2 != 0) {
                if (i == amountOfGladiators / 2) {
                    combatTree += "fighter" + i + "------  \n";
                    combatTree += "                                                  |------------Winner  \n";
                } else {
                    combatTree += "fighter" + i + "------  \n";
                    combatTree += " " +
                            "            |----------winner" + i + "----------\n";
                }
            } else {
                combatTree += "fighter" + i + "------  \n";
                if (i != amountOfGladiators && i != amountOfGladiators / 2) {
                    combatTree += "                                         |------------  \n";
                } else if (i == amountOfGladiators / 2) {
                    combatTree += "                                                  |------------Winner  \n";
                } else {
                    combatTree += "    \n";
                }
            }
        }
        System.out.println(combatTree);
    }
    private List<String> list = new ArrayList<>();
    public void hehe(int amount){
        for (int i = 1; i < amount + 1; i++) {
            list.add("player" + i + "   ");
            list.add("      ");
        }
        for (int y = 1; y < amount + 1; y++){
            for (int i = y; i < list.size() - 1; i+=4){
                String some = list.get(i).toString();
                list.set(i, some + "player  ");
            }
        }


        System.out.println(list.toString().replace(',', '\n'));
    }
    private String spaces (int num){
        return " ".repeat(num);
    }
    private int amountOfSpaces = 1;
    public void laci(int amount){
        for (int i = 1; i < amount + 1; i++) {
            list.add( spaces(amountOfSpaces)+"player" + i + "   ");
            list.add("");
        }
        for (int y = 0; y < amount -1 ; y++){
            for (int i = y; i < list.size() - 1; i+=4){
                String some = list.get(i).toString();
                list.set(i, some + spaces(amountOfSpaces + 8)+ "player");
            }
        }
        System.out.println(list.toString().replace(',', '\n'));
    }

}
