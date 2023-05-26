package com.codecool.gladiator.data;

public enum StatisticMultiplier {
    LOW(0.75),
    MEDIUM(1),
    HIGH(1.25);

    private final double multiplier;

    public double getMultiplier() {
        return multiplier;
    }

    StatisticMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }
}
