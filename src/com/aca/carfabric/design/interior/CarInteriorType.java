package com.aca.carfabric.design.interior;

public enum CarInteriorType implements InteriorType {
    GOOD(1000),
    BAD(200);

    private final int price;

    CarInteriorType(int price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
