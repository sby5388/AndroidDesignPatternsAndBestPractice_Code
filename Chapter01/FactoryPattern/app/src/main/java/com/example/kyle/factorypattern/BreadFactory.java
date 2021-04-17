package com.example.kyle.factorypattern;

import com.example.kyle.factorypattern.breads.Baguette;
import com.example.kyle.factorypattern.breads.Bread;
import com.example.kyle.factorypattern.breads.Brioche;
import com.example.kyle.factorypattern.breads.Roll;

/**
 * Created by kyle on 26/07/2016.
 */
public class BreadFactory {

    public Bread getBread(String breadType) {

        if (breadType == null) {
            return null;
        }

        if ("BRI".equals(breadType)) {
            return new Brioche();

        } else if ("BAG".equals(breadType)) {
            return new Baguette();

        } else if ("ROL".equals(breadType)) {
            return new Roll();
        }

        return null;
    }
}
