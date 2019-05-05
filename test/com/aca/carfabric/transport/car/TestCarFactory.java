package com.aca.carfabric.transport.car;

import com.aca.testutil.Assert;
import com.aca.carfabric.design.interior.CarInteriorType;
import com.aca.carfabric.engine.EngineType;
import com.aca.carfabric.transport.car.crossover.CrossoverType;
import com.aca.carfabric.wheel.Wheel;
import com.aca.carfabric.wheel.WheelType;
import com.aca.carfabric.wheel.wheels.WheelDriveType;

public class TestCarFactory {

    private static CarFactory carFactory = new CarFactory();

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        testSedanFactory();
        System.out.println("Car factory tests are passed");
    }

    private static void testSedanFactory() {
        Car car = carFactory.create(
                CarType.CROSSOVER,
                CrossoverType.ECONOM,
                EngineType.ELECTRIC,
                WheelType.SUMMER,
                WheelDriveType.FULL,
                CarInteriorType.BAD);

        Assert.equals(car.getCarType(), CarType.CROSSOVER);
        Assert.equals(car.getEngine().getEngineType(), EngineType.ELECTRIC);
        Assert.equals(car.getWheelButch().getWheels().length, 4);
        Assert.equals(car.getWheelButch().getWheelDriveType(), WheelDriveType.FULL);
        for (Wheel wheel : car.getWheelButch().getWheels()) {
            Assert.equals(wheel.getWheelType(), WheelType.SUMMER);
        }
        Assert.equals(car.getInterior().getInteriorType(), CarInteriorType.BAD);
    }

}
