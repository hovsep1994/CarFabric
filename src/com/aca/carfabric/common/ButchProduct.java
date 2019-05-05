package com.aca.carfabric.common;

public abstract class ButchProduct extends Product {

    protected abstract double getButchPrice();

    protected static double calculateButchPrice(SingleProduct[] products) {
        double sum = 0;
        for (SingleProduct product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

}
