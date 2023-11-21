package com.github.curriculeon;

public class MainApplication {
    public static void main(String[] args) {
        final TomatoPlant tomatoPlant = new TomatoPlant();
        final Tomato tomato = tomatoPlant.yield();
        tomatoPlant.vegetate();
    }
}
