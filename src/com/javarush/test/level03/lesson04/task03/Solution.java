package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "5";
        Zerg zerg6 = new Zerg();
        zerg6.name = "6";
        Zerg zerg7 = new Zerg();
        zerg7.name = "7";
        Zerg zerg8 = new Zerg();
        zerg8.name = "8";
        Zerg zerg9 = new Zerg();
        zerg9.name = "9";
        Zerg zerg10 = new Zerg();
        zerg10.name = "10";

        Protos protos1 = new Protos();
        Protos protos2 = new Protos();
        Protos protos3 = new Protos();
        Protos protos4 = new Protos();
        Protos protos5 = new Protos();
        protos1.name = "1";
        protos2.name = "2";
        protos3.name = "3";
        protos4.name = "4";
        protos5.name = "5";

        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();
        terran1.name = "1";
        terran2.name = "2";
        terran3.name = "3";
        terran4.name = "4";
        terran5.name = "5";
        terran6.name = "6";
        terran7.name = "7";
        terran8.name = "8";
        terran9.name = "9";
        terran10.name = "10";
        terran11.name = "11";
        terran12.name = "12";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}