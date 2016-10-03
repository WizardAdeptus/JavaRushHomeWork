package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
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
        int count = 0;

        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(bufferedReader.readLine());
            if (num[i] >= 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
