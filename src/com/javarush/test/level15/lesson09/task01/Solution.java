package com.javarush.test.level15.lesson09.task01;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }

    static{
        labels.put((double) 3.14,"Pi");
        labels.put((double) 4.4,"A");
        labels.put(23.1,"me");
        labels.put(78.6,"B");
        labels.put(24.2,"C");
    }
}
