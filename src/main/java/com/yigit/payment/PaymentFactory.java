package com.yigit.payment;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PaymentFactory {

    public static PaymentMethod create(String className, String param) throws Exception {
        try {
            Class<?> clazz = Class.forName("com.yigit.payment." + className);
            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
            return (PaymentMethod) constructor.newInstance(param);
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof IllegalArgumentException) {
                throw (IllegalArgumentException) e.getCause();
            }
            throw e;
        }
    }
}
