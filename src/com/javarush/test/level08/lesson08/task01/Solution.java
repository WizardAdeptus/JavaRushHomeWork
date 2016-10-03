package com.javarush.test.level08.lesson08.task01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        HashSet<String> list = new HashSet<String>();
        Collections.addAll(list,
                "Литр", "Лимон", "Лимонад", "Лайм", "Лук",
                "Лут", "Лотос", "Лосось", "Любовь", "Ломоть",
                "Лохмотья", "Лом", "Лейбл", "Лягушка", "Лицо",
                "Лизун", "Лайк", "Лайка", "Лоза", "Литерал");
        return list;
    }
}
