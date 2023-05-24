//package com.codecool.gladiator.logic;
//
//import com.codecool.gladiator.data.gladiator.Gladiator;
//
//import java.util.List;
//
//public class Tree {
//
//    public StringBuilder getSb() {
//        return sb;
//    }
//    private StringBuilder sb = new StringBuilder();
//    private boolean isFirstRound = true;
//    private int sorUgras = 2;
//    private int sorEleje = 0;
//
//    public void setFirstRound(boolean firstRound) {
//        isFirstRound = firstRound;
//    }
//
////    public void drawTree(List<Gladiator> gladiatorList) {
////
////        List<Gladiator> aliveGladiators = gladiatorList.stream()
////                .filter(gladiator -> !gladiator.isDefeated()).toList();
////
////        for (Gladiator gladiator : aliveGladiators) {
////            sb.append("----").append(gladiator.getName()).append("----");
////            sb.append(sortoresKeszito(sorUgras));
////        }
////        sorUgras = sorUgras * 2;
////    }
//
//    public String sortoresKeszito(int number) {
//        return "\n".repeat(number));
//    }
//}
