package com.aca.carfabric.transport;

import com.aca.carfabric.common.ButchProduct;
import com.aca.carfabric.design.interior.Interior;
import com.aca.carfabric.engine.Engine;
import com.aca.carfabric.wheel.wheels.WheelButch;

public abstract class Transport extends ButchProduct {

    private Engine engine;
    private WheelButch wheelButch;
    private Interior interior;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheelButch(WheelButch wheelButch) {
        this.wheelButch = wheelButch;
    }

    public void setInterior(Interior interior) {
        this.interior = interior;
    }

    public Engine getEngine() {
        return engine;
    }

    public WheelButch getWheelButch() {
        return wheelButch;
    }

    public Interior getInterior() {
        return interior;
    }

    @Override
    protected double getButchPrice() {
        return engine.getPrice() + wheelButch.getButchPrice();
    }

    @Override
    public String getDescription() {
        return engine.getDescription() + wheelButch.getDescription() + interior.getDescription();
    }
}
