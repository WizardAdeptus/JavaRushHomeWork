package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5, 5, 1, 1);

        //напишите тут ваш код
        Cat cat = new Cat("Tom", 12, 5, 5, 1, 1);
        Dog dog = new Dog("Dog", 12, 5, 5, 1, 1);
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;
        int weight;
        int x;
        int y;

        public Mouse(String name, int height, int tail, int weight, int x, int y)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
            this.weight = weight;
            this.x = x;
            this.y = y;
        }
    }

    //добавьте тут ваши классы
    public static class Cat
    {
        String name;
        int height;
        int tail;
        int weight;
        int x;
        int y;

        public Cat(String name, int height, int tail, int weight, int x, int y)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
            this.weight = weight;
            this.x = x;
            this.y = y;
        }
    }
    public static class Dog
    {
        String name;
        int height;
        int tail;
        int weight;
        int x;
        int y;

        public Dog(String name, int height, int tail, int weight, int x, int y)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
            this.weight = weight;
            this.x = x;
            this.y = y;
        }
    }

}
