package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        int tmpNum;

        if (num[0] < num[1]) {
            tmpNum = num[0];
            num[0] = num[1];
            num[1] = tmpNum;
        }
        if (num[1] < num[2]) {
            tmpNum = num[1];
            num[1] = num[2];
            num[2] = tmpNum;
        }
        if (num[0] < num[1]) {
            tmpNum = num[0];
            num[0] = num[1];
            num[1] = tmpNum;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
