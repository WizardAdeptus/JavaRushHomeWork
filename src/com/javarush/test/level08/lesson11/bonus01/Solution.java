package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> months = new ArrayList<String>();
        Collections.addAll(
                months,
                "january",
                "february",
                "march",
                "april",
                "may",
                "june",
                "july",
                "august",
                "september",
                "october",
                "november",
                "december");
        String month = reader.readLine();
        month =  month.trim();
        month = month.toLowerCase();

        for (int i = 0; i < months.size(); i++) {
            if (months.get(i).equals(month)) {
                System.out.println(
                        month.substring(0, 1).toUpperCase() + month.substring(1) + " is " + (i + 1) + " month");
                break;
            }
        }
    }
}
