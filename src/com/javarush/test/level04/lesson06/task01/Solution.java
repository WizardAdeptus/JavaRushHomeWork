package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sNum1 = bufferedReader.readLine();
        String sNum2 = bufferedReader.readLine();
        int dNum1 = Integer.parseInt(sNum1);
        int dNum2 = Integer.parseInt(sNum2);

        System.out.println(dNum1 < dNum2 ? dNum1 : dNum2);
    }
}