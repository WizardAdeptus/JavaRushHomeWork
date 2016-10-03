package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Перминов", "Игорь");
        map.put("123", "321");
        map.put("Федюшкин", "Андрей");
        map.put("Зыбайло", "Андрей");
        map.put("Меркулов", "Александр");
        map.put("Грейц", "Александра");
        map.put("Крень", "Игорь");
        map.put("Бессараб", "Антон");
        map.put("Кошель", "Дмитрий");
        map.put("Овсянников", "Алексей");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        Iterator<String> iterator = map.values().iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            if (name.equals(iterator.next())) {
                counter++;
            }
        }

        return counter;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        Iterator<String> iterator = map.keySet().iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            if (lastName.equals(iterator.next())) {
                counter++;
            }
        }
        return counter;
    }
}
