package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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

        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int x = 0;

        if (num[0] == num[1] && num[2] != num[1]) {
            x = 3;
        } else if (num[1] == num[2] && num[0] != num[1]) {
            x = 1;
        } else if (num[0] == num[2] && num[1] != num[0]) {
            x = 2;
        }

        System.out.println(x);
    }
}
