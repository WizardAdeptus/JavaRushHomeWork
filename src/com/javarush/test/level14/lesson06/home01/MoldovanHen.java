package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Игорь on 31.08.2016.
 */
public class MoldovanHen extends Hen implements Country{

    @Override
    public String getDescription() {
        return super.getDescription() +
                " Моя страна - " +
                MOLDOVA +
                ". Я несу " +
                getCountOfEggsPerMonth() +
                " яиц в месяц.";
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 23;
    }
}
