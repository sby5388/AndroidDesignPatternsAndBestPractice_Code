package com.example.kyle.abstractfactory.drink;

/**
 * @author Administrator  on 2021/4/17.
 */
public class GreenTea implements Drink {
    @Override
    public String name() {
        return "GreenTea";
    }

    @Override
    public String calories() {
        return " : 10 kcal";
    }
}
