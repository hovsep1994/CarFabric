package com.aca.carfabric.engine;

import com.aca.carfabric.common.SingleProduct;

public abstract class Engine extends SingleProduct {

    private EngineType engineType;

    Engine(EngineType engineType, double price) {
        super(price);
        this.engineType = engineType;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Engine : " + engineType + " price : " + price + "\n";
    }
}
