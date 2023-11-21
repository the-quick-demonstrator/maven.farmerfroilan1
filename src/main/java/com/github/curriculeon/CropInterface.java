package com.github.curriculeon;

public interface CropInterface {
    // i can't make private fields, but
    // i can make public getters
    default int getHeight() {
        return -1;
    }
}
