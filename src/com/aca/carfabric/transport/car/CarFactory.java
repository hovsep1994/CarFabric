package com.aca.carfabric.transport.car;

import com.aca.carfabric.design.interior.InteriorType;
import com.aca.carfabric.engine.EngineType;
import com.aca.carfabric.transport.car.crossover.CrossoverFactory;
import com.aca.carfabric.transport.car.crossover.CrossoverType;
import com.aca.carfabric.transport.car.sedan.SedanFactory;
import com.aca.carfabric.transport.car.sedan.SedanType;
import com.aca.carfabric.wheel.WheelType;
import com.aca.carfabric.wheel.wheels.WheelDriveType;

public class CarFactory {

    protected CrossoverFactory crossoverFactory = new CrossoverFactory();
    protected SedanFactory sedanFactory = new SedanFactory();

    public Car create(CarType carType,
                      CarSubType subType,
                      EngineType engineType,
                      WheelType wheelType,
                      WheelDriveType wheelDriveType,
                      InteriorType interiorType) {
        Car car;
        switch (carType) {
            case SEDAN:
                car = sedanFactory.createSedan(
                        (SedanType) subType,
                        engineType,
                        wheelType,
                        wheelDriveType,
                        interiorType);
                break;
            case CROSSOVER:
                if (wheelDriveType != WheelDriveType.FULL) {
                    throw new IllegalArgumentException("WheelDriveType for crossovers must be FULL");
                }
                car = crossoverFactory.createCrossover(
                        (CrossoverType) subType,
                        engineType,
                        wheelType,
                        interiorType
                );
                break;
            case HATCHBACK:
            default:
                throw new IllegalArgumentException("Car type - " + carType + " is not supported");
        }
        return car;
    }
}
