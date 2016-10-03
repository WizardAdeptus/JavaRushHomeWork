package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String filePath = reader.readLine();

            BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));

            String line;

            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.toString();
        }
    }
}
