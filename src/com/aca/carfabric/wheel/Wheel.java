package com.aca.carfabric.wheel;

import com.aca.carfabric.common.SingleProduct;

public class Wheel extends SingleProduct {

    protected WheelType wheelType;

    public Wheel(WheelType wheelType, double price) {
        super(price);
        this.wheelType = wheelType;
    }

    public WheelType getWheelType() {
        return wheelType;
    }

    public void setWheelType(WheelType wheelType) {
        this.wheelType = wheelType;
    }

    @Override
    public String getDescription() {
        return "wheel : " + wheelType + " price : " + price + "\n";
    }
}
