package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Игорь on 03.09.2016.
 */
class Monitor implements CompItem {

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
