package com.javarush.test.level04.lesson07.task01;

/* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
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

        int x = Integer.parseInt(bufferedReader.readLine());
        String description = "";

        if (x == 0) {
            description = "нулевое";
        } else {
            if (x < 0) {
                description = "отрицательное";
            } else {
                description = "положительное";
            }

            if (x % 2 == 0) {
                description += " четное";
            } else {
                description += " нечетное";
            }
        }
        System.out.println(description + " число");
    }
}
