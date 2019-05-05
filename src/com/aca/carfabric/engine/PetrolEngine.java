package com.aca.carfabric.engine;

public class PetrolEngine extends Engine {

    private static final double PRICE = 200;

    PetrolEngine() {
        super(EngineType.PETROL, PRICE);
    }
}
