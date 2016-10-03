package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("1", new Date(1985, 0, 22));
        map.put("2", new Date(1985, 2, 24));
        map.put("3", new Date(1985, 3, 24));
        map.put("4", new Date(1985, 4, 24));
        map.put("5", new Date(1985, 5, 24));
        map.put("6", new Date(1985, 6, 24));
        map.put("7", new Date(1985, 7, 24));
        map.put("8", new Date(1985, 8, 24));
        map.put("9", new Date(1985, 9, 24));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            if ((pair.getValue().getMonth() > 4) & (pair.getValue().getMonth() < 8)) {
                iterator.remove();
            }
        }
    }
}
