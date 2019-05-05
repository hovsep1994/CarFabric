package com.aca.carfabric.common;

public abstract class Product {

    public abstract String getDescription();

    protected static String getProductsDescription(Product... products) {
        StringBuilder s = new StringBuilder();
        for (Product product : products) {
            s.append(product.getDescription());
        }
        return s.toString();
    }

}
