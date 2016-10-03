package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String[] dayOfTheWeek = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sDay = bufferedReader.readLine();
        int dDay = Integer.parseInt(sDay);

        if (dDay > 0 && dDay < 8)
        {
            System.out.println(dayOfTheWeek[dDay - 1]);
        }
        else
        {
            System.out.println("такого дня недели не существует");
        }
    }

}