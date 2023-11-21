package com.github.curriculeon;

public interface TomatoPlantInterface extends CropInterface, VegetablePlantInterface {
    default Tomato yield() {
        return new Tomato();
    }
}
