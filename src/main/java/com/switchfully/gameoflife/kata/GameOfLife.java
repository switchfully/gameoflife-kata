package com.switchfully.gameoflife.kata;


import java.util.Collections;
import java.util.List;

public class GameOfLife {

    public List<List<Boolean>> generateNextWorld(List<List<Boolean>> currentWorld) {
        Collections.shuffle(currentWorld);
        return currentWorld;
    }
}
