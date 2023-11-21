package com.github.curriculeon;

public interface VegetablePlantInterface {
    default void vegetate() {
        System.out.println("I'm vegetating");
    }
}
