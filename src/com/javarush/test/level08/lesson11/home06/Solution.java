    package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

    import java.util.ArrayList;
    import java.util.Collections;

    public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> famaly = new ArrayList<Human>();

        famaly.add(new Human("Игорь", true, 31));
        famaly.add(new Human("Яна", false, 26));
        famaly.add(new Human("Саша", true, 18));

        famaly.add(new Human("папа Саша", true, 50));
        famaly.get(3).children.add(famaly.get(0));
        famaly.get(3).children.add(famaly.get(1));
        famaly.get(3).children.add(famaly.get(2));
        famaly.add(new Human("мама Лена", false, 48));
        famaly.get(4).children.add(famaly.get(0));
        famaly.get(4).children.add(famaly.get(1));
        famaly.get(4).children.add(famaly.get(2));

        famaly.add(new Human("дед Саша", true, 70));
        famaly.get(5).children.add(famaly.get(4));
        famaly.add(new Human("бабушка Люся", false, 65));
        famaly.get(6).children.add(famaly.get(4));

        famaly.add(new Human("дед Дима", true, 75));
        famaly.get(7).children.add(famaly.get(3));
        famaly.add(new Human("бабушка Лида", false, 73));
        famaly.get(8).children.add(famaly.get(3));

        for (int i = 0; i < famaly.size(); i++) {
            System.out.println(famaly.get(i));
        }
    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human() {
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {

            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
