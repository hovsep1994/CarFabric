package com.aca.carfabric;

import com.aca.carfabric.transport.car.TestCarFactory;
import com.aca.carfabric.transport.car.sedan.TestSedanFactory;

public class TestsMain {
    public static void main(String[] args) {
        TestCarFactory.run();
        TestSedanFactory.run();
    }
}
