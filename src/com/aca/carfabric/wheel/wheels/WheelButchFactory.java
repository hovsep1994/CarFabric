package com.aca.carfabric.wheel.wheels;

import com.aca.carfabric.wheel.Wheel;
import com.aca.carfabric.wheel.WheelFactory;
import com.aca.carfabric.wheel.WheelType;

public class WheelButchFactory {

    private static final WheelFactory WHEEL_FACTORY = new WheelFactory();

    public WheelButch createButchWheel(int wheelCount, WheelType wheelType, WheelDriveType wheelDriveType) {
        validate(wheelCount);
        Wheel[] wheels = new Wheel[wheelCount];
        for (int i = 0; i < wheelCount; i++) {
            wheels[i] = WHEEL_FACTORY.create(wheelType);
        }
        return new WheelButch(wheels, wheelDriveType);
    }

    private static void validate(int wheelCount) {
        if (wheelCount < 2 || wheelCount > 4) {
            throw new IllegalArgumentException("Wheels count must be not less 2 and not more 4");
        }
    }
}
