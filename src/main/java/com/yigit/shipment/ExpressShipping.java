package com.yigit.shipment;

public class ExpressShipping implements ShippingStrategy {
    @Override
    public String getShippingType() {
        return "Express";
    }

    @Override
    public void processShipment() {
        System.out.println("Express shipping is ready");
    }

    @Override
    public double calculateShipping(double orderAmount) {
        return orderAmount / 15;
    }
}