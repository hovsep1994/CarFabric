package com.aca.carfabric.transport.car.sedan;

import com.aca.testutil.Assert;
import com.aca.carfabric.design.interior.CarInteriorType;
import com.aca.carfabric.engine.EngineType;
import com.aca.carfabric.transport.car.Car;
import com.aca.carfabric.transport.car.CarType;
import com.aca.carfabric.wheel.Wheel;
import com.aca.carfabric.wheel.WheelType;
import com.aca.carfabric.wheel.wheels.WheelDriveType;

public class TestSedanFactory {

    private static SedanFactory carFactory = new SedanFactory();

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        testSedanFactory();
        System.out.println("Sedan factory tests are passed");
    }

    private static void testSedanFactory() {
        Car car = carFactory.createSedan(
                SedanType.ECONOM,
                EngineType.ELECTRIC,
                WheelType.SUMMER,
                WheelDriveType.BACK,
                CarInteriorType.BAD
        );
        Assert.equals(car.getCarType(), CarType.SEDAN);
        Assert.equals(car.getEngine().getEngineType(), EngineType.ELECTRIC);
        Assert.equals(car.getWheelButch().getWheels().length, 4);
        Assert.equals(car.getWheelButch().getWheelDriveType(), WheelDriveType.BACK);
        for (Wheel wheel : car.getWheelButch().getWheels()) {
            Assert.equals(wheel.getWheelType(), WheelType.SUMMER);
        }
        Assert.equals(car.getInterior().getInteriorType(), CarInteriorType.BAD);
    }

}
