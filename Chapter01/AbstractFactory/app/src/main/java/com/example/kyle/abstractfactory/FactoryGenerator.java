package com.example.kyle.abstractfactory;

/**
 * Created by kyle on 26/07/2016.
 */
public class FactoryGenerator {

    public static AbstractFactory getFactory(String factory) {

        if (factory == null) {
            return null;
        }

        if ("BRE".equals(factory)) {
            return new BreadFactory();
        } else if ("FIL".equals(factory)) {
            return new FillingFactory();
        } else if ("DRINK".equals(factory)) {
            return new DrinkFactory();
        }

        return null;
    }
}
