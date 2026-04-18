package com.yigit.shipment;

public class OrderService {
    private ShippingStrategy shippingStrategy;


    public OrderService(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void shipment(double orderAmount) {
        double shipmentCost = shippingStrategy.calculateShipping(orderAmount);
        System.out.println("Shipment Cost: " + shipmentCost);
        shippingStrategy.processShipment();
    }
}

