package com.aca.carfabric.design.interior;

public enum MotorcycleInteriorType implements InteriorType {
    RACING,
    CITY;

    @Override
    public double getPrice() {
        return 0;
    }
}
