package com.github.alicefrancener.factory.domain;

import java.lang.reflect.InvocationTargetException;

public class FactoryTrabalhador {

    public static <T> T newInstance(String className) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> classe = Class.forName(className);
        return (T) classe.getDeclaredConstructor().newInstance();

    }

}
