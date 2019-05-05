package com.aca.carfabric.wheel;

public class WheelFactory {

    public Wheel create(WheelType type) {
        switch (type) {
            case SUMMER:
                return new Wheel(WheelType.SUMMER, 100);
            case WINTER:
                return new Wheel(WheelType.WINTER, 200);
            default:
                throw new RuntimeException("WheelType - " + type + " is unknown");
        }
    }
}
