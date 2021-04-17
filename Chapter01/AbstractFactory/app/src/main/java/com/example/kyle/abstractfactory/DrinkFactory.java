package com.example.kyle.abstractfactory;

import com.example.kyle.abstractfactory.breads.Bread;
import com.example.kyle.abstractfactory.drink.Drink;
import com.example.kyle.abstractfactory.drink.GreenTea;
import com.example.kyle.abstractfactory.fillings.Filling;

/**
 * @author Administrator  on 2021/4/17.
 */
public class DrinkFactory extends AbstractFactory {
    @Override
    Bread getBread(String bread) {
        return null;
    }

    @Override
    Filling getFilling(String filling) {
        return null;
    }

    @Override
    Drink getDrink(String drinkType) {
        if ("GreenTea".equals(drinkType)) {
            return new GreenTea();
        }
        return null;
    }
}
