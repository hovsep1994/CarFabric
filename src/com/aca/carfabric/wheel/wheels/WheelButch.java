package com.aca.carfabric.wheel.wheels;

import com.aca.carfabric.common.ButchProduct;
import com.aca.carfabric.wheel.Wheel;

public class WheelButch extends ButchProduct {

    private Wheel[] wheels;
    private WheelDriveType wheelDriveType;

    WheelButch(Wheel[] wheels, WheelDriveType wheelDriveType) {
        this.wheels = wheels;
        this.wheelDriveType = wheelDriveType;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public WheelDriveType getWheelDriveType() {
        return wheelDriveType;
    }

    public void setWheelDriveType(WheelDriveType wheelDriveType) {
        this.wheelDriveType = wheelDriveType;
    }

    @Override
    public double getButchPrice() {
        return calculateButchPrice(wheels);
    }

    @Override
    public String getDescription() {
        return "Wheels : " + wheelDriveType.name() +
                "\n" + getProductsDescription(wheels);
    }
}
