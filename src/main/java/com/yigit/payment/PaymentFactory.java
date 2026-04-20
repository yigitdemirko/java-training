package com.yigit.payment;

import java.lang.reflect.Constructor;

public class PaymentFactory {

    public static PaymentMethod create(String className, String param) throws Exception {
        Class<?> clazz = Class.forName("com.yigit.payment." + className);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
        return (PaymentMethod) constructor.newInstance(param);
    }
}
