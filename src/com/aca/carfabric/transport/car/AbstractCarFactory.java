package com.aca.carfabric.transport.car;

import com.aca.carfabric.design.interior.InteriorFactory;
import com.aca.carfabric.design.interior.InteriorType;
import com.aca.carfabric.engine.EngineFactory;
import com.aca.carfabric.engine.EngineType;
import com.aca.carfabric.wheel.WheelType;
import com.aca.carfabric.wheel.wheels.WheelButchFactory;
import com.aca.carfabric.wheel.wheels.WheelDriveType;

public class AbstractCarFactory {

    protected EngineFactory engineFactory = new EngineFactory();
    protected WheelButchFactory wheelButchFactory = new WheelButchFactory();
    protected InteriorFactory interiorFactory = new InteriorFactory();

    protected void setCarAttributes(
            Car car,
            EngineType engineType,
            WheelType wheelType,
            WheelDriveType wheelDriveType,
            InteriorType interiorType
    ) {
        car.setEngine(engineFactory.create(engineType));
        car.setWheelButch(wheelButchFactory.createButchWheel(4, wheelType, wheelDriveType));
        car.setInterior(interiorFactory.create(interiorType));
    }

}
