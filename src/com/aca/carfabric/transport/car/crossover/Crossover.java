package com.aca.carfabric.transport.car.crossover;

import com.aca.carfabric.transport.car.Car;
import com.aca.carfabric.transport.car.CarType;

public class Crossover extends Car {

    protected CrossoverType crossoverType;

    Crossover() {
        super(CarType.CROSSOVER);
    }

    public void setSedanType(CrossoverType crossoverType) {
        this.crossoverType = crossoverType;
    }
}
