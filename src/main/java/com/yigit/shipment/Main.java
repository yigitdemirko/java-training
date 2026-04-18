package com.yigit.shipment;

public class Main {
    public static void main(String[] args) {
        double orderAmount = 120.30;

        ShippingStrategy strategy = orderAmount > 100
                ? new FreeShipping()
                : new StandardShipping();

        OrderService shippingProcessor = new OrderService(strategy);
        shippingProcessor.shipment(orderAmount);

        System.out.println("------");

        double orderAmount2 = 50;
        ShippingStrategy strategy2 = orderAmount2 > 100
                ? new FreeShipping()
                : new StandardShipping();

        OrderService shippingProcessor2 = new OrderService(strategy2);
        shippingProcessor2.shipment(orderAmount2);

        System.out.println("------");

        double orderAmount3 = 50;
        ShippingStrategy strategy3 = new ExpressShipping();

        OrderService shippingProcessor3 = new OrderService(strategy3);
        shippingProcessor3.shipment(orderAmount3);
    }
}
