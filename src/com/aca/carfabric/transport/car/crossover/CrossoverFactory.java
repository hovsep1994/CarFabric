package com.aca.carfabric.transport.car.crossover;

import com.aca.carfabric.design.interior.InteriorType;
import com.aca.carfabric.engine.EngineType;
import com.aca.carfabric.transport.car.AbstractCarFactory;
import com.aca.carfabric.wheel.WheelType;
import com.aca.carfabric.wheel.wheels.WheelDriveType;

public class CrossoverFactory extends AbstractCarFactory {

    public Crossover createCrossover(CrossoverType crossoverType,
                                     EngineType engineType,
                                     WheelType wheelType,
                                     InteriorType interiorType) {
        final Crossover car = new Crossover();
        car.setSedanType(crossoverType);
        setCarAttributes(car, engineType, wheelType, WheelDriveType.FULL, interiorType);
        return car;
    }

}
