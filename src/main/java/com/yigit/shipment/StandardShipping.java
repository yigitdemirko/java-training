package com.yigit.shipment;

public class StandardShipping implements ShippingStrategy {

    @Override
    public String getShippingType() {
        return "Standart";
    }

    @Override
    public void processShipment() {
        System.out.println("Standard shipping is ready");
    }

    @Override
    public double calculateShipping(double orderAmount) {
        return orderAmount / 20;
    }
}

