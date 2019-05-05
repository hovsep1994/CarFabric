package com.aca;

import com.aca.carfabric.design.interior.CarInteriorType;
import com.aca.carfabric.engine.EngineType;
import com.aca.carfabric.transport.car.Car;
import com.aca.carfabric.transport.car.sedan.SedanFactory;
import com.aca.carfabric.transport.car.sedan.SedanType;
import com.aca.carfabric.wheel.WheelType;
import com.aca.carfabric.wheel.wheels.WheelDriveType;

public class Main {

    private static SedanFactory sedanFactory = new SedanFactory();

    public static void main(String[] args) {

        Car car = sedanFactory.createSedan(
                SedanType.ECONOM,
                EngineType.ELECTRIC,
                WheelType.SUMMER,
                WheelDriveType.BACK,
                CarInteriorType.BAD
        );

        System.out.println(car.getDescription());
    }
}
