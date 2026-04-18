package com.yigit.shipment;

public class FreeShipping implements ShippingStrategy {
    @Override
    public String getShippingType() {
        return "Free";
    }

    @Override
    public void processShipment() {
        System.out.println("Free shipping is ready");
    }

    @Override
    public double calculateShipping(double orderAmount) {
        return 0;
    }
}
