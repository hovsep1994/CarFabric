package com.aca.carfabric.transport.car;

import com.aca.carfabric.transport.Transport;

public class Car extends Transport {

    private CarType carType;

    protected Car(CarType carType) {
        this.carType = carType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String getDescription() {
        return "Car : " + carType + "\n" + super.getDescription();
    }

}
