package com.aca.carfabric.transport.car.sedan;

import com.aca.carfabric.design.interior.InteriorType;
import com.aca.carfabric.engine.EngineType;
import com.aca.carfabric.transport.car.AbstractCarFactory;
import com.aca.carfabric.transport.car.CarType;
import com.aca.carfabric.wheel.WheelType;
import com.aca.carfabric.wheel.wheels.WheelDriveType;

public class SedanFactory extends AbstractCarFactory {

    public Sedan createSedan(SedanType sedanType,
                             EngineType engineType,
                             WheelType wheelType,
                             WheelDriveType wheelDriveType,
                             InteriorType interiorType) {
        final Sedan sedan = new Sedan();
        sedan.setSedanType(sedanType);
        setCarAttributes(sedan, engineType, wheelType, wheelDriveType, interiorType);
        return sedan;
    }

}
