package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 2 2020"));

    }

    public static boolean isDateOdd(String date)
    {
        Date tmpDate1 = new Date(date);
        Date tmpDate2 = new Date(date);
        tmpDate2.setHours(0);
        tmpDate2.setMinutes(0);
        tmpDate2.setSeconds(0);
        tmpDate2.setDate(1);
        tmpDate2.setMonth(0);
        long msTimeDistance = tmpDate2.getTime() - tmpDate1.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int y = (int)(msTimeDistance/msDay);
        if (y % 2 == 0) {
            return true;
        }

        return false;
    }
}
