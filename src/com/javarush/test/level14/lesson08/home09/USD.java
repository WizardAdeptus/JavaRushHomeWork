package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Игорь on 04.09.2016.
 */
public class USD extends Money {

    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
