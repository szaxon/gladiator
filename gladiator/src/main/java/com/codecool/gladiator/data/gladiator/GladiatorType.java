package com.codecool.gladiator.data.gladiator;

public enum GladiatorType {
    ARCHER("'s shiny long sharp arrow pierces the liver, dealing ", " says not today"),
    ASSASSIN(" sneaks and jumps and start biting, dealing "," gives himself away with a loud noise and runs away"),
    BRUTAL(" slaps the life out his enemy dealing ", " slips and falls"),
    SWORDSMAN("'s sword cuts off the enemy's legs, dealing ", "'s sword brakes while attacking");
    private final String hitMessage;
    private final String missMassage;
    GladiatorType(String message, String missMassage) {
        this.hitMessage = message;
        this.missMassage = missMassage;
    }
    public String getHitMessage(){
        return hitMessage;
    }
    public String getMissMassage() {
        return missMassage;
    }
}
