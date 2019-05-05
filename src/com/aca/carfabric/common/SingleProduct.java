package com.aca.carfabric.common;

public abstract class SingleProduct extends Product {

    protected double price;

    public SingleProduct(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
