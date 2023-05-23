package com.codecool.gladiator.logic;

import java.util.Random;

public class RandomNumberGenerator {

    public int generateRandom(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
}
