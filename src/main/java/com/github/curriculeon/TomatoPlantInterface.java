package com.github.curriculeon;

public interface TomatoPlantInterface extends CropInterface {
    default Tomato yield() {
        return new Tomato();
    }
}
