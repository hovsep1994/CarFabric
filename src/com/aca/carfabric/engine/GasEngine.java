package com.aca.carfabric.engine;

public class GasEngine extends Engine {

    private static final double PRICE = 300;

    GasEngine() {
        super(EngineType.GAS, PRICE);
    }
}
