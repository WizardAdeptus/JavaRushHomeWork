package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        HashMap<String, Cat> hashMap = new HashMap<String, Cat>();
        hashMap.put("01", new Cat("01"));
        hashMap.put("02", new Cat("02"));
        hashMap.put("03", new Cat("03"));
        hashMap.put("04", new Cat("04"));
        hashMap.put("05", new Cat("05"));
        hashMap.put("06", new Cat("06"));
        hashMap.put("07", new Cat("07"));
        hashMap.put("08", new Cat("08"));
        hashMap.put("09", new Cat("09"));
        hashMap.put("10", new Cat("10"));

        return hashMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        HashSet<Cat> hashSet = new HashSet<Cat>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            hashSet.add(pair.getValue());
        }

        return hashSet;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
