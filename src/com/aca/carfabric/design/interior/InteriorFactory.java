package com.aca.carfabric.design.interior;

public class InteriorFactory {

    public Interior create(InteriorType interiorType) {
        return new Interior(interiorType);
    }

}
