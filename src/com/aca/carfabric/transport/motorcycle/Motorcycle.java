package com.aca.carfabric.transport.motorcycle;

import com.aca.carfabric.transport.Transport;

public class Motorcycle extends Transport {

    private MotorCycleType motorCycleType;

    public void setMotorCycleType(MotorCycleType motorCycleType) {
        this.motorCycleType = motorCycleType;
    }

    @Override
    public String getDescription() {
        return "Motorcycle : " + motorCycleType + super.getDescription();
    }
}
