package com.codecool.gladiator.logic;

import java.util.Random;

public class RandomNumberGenerator {

    public int generateRandom(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
    public double generateRandomDouble(double rangeStart, double rangeEnd){
        Random random = new Random();
        return rangeStart + (rangeEnd - rangeStart) * random.nextDouble();
    }
}
