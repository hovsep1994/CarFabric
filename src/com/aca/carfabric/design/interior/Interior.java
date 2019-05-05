package com.aca.carfabric.design.interior;

import com.aca.carfabric.common.SingleProduct;

public class Interior extends SingleProduct {

    private InteriorType interiorType;

    public Interior(InteriorType interiorType) {
        super(interiorType.getPrice());
        this.interiorType = interiorType;
    }

    public InteriorType getInteriorType() {
        return interiorType;
    }

    public void setInteriorType(InteriorType interiorType) {
        this.interiorType = interiorType;
    }

    @Override
    public String getDescription() {
        return "Interior : " + interiorType + " : " + price;
    }
}
