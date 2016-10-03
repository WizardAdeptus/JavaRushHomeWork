package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;

public class Solution
{
    public static void main(String[] args)
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String readLine = reader.readLine();
            File file = new File(readLine);

            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;

            LinkedList<String> list = new LinkedList<String>();
            String line = "";
            while (!(line).equals("exit")) {
                list.add((line = reader.readLine()) + System.getProperty("line.separator"));
            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String value : list) {
                bufferedWriter.write(value);
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
