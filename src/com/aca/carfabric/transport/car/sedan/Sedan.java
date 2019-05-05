package com.aca.carfabric.transport.car.sedan;

import com.aca.carfabric.transport.car.Car;
import com.aca.carfabric.transport.car.CarType;

public class Sedan extends Car {

    private SedanType sedanType;

    Sedan() {
        super(CarType.SEDAN);
    }

    public void setSedanType(SedanType sedanType) {
        this.sedanType = sedanType;
    }

    @Override
    public String getDescription() {
        return "Sedan :" + sedanType + "\n" + super.getDescription();
    }
}
