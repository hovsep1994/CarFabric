package com.aca.carfabric.engine;

public class ElectricEngine extends Engine {

    private static final double PRICE = 100;

    ElectricEngine() {
        super(EngineType.ELECTRIC, PRICE);
    }
}
