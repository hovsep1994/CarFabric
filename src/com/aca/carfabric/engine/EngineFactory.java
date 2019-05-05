package com.aca.carfabric.engine;

public class EngineFactory {

    public Engine create(EngineType type) {
        switch (type) {
            case GAS:
                return new GasEngine();
            case PETROL:
                return new PetrolEngine();
            case ELECTRIC:
                return new ElectricEngine();
            default:
                throw new RuntimeException("EngineType - " + type + " is not supported");
        }
    }

    public EngineType[] getTypes() {
        return EngineType.values();
    }

}
