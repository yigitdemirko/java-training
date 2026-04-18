package com.yigit.shipment;

public interface ShippingStrategy {
    String getShippingType();
    void processShipment();
    double calculateShipping(double orderAmount);
}
