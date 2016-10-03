package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String firstname;
        String lastname;
        String nickname;
        String password;
        Date birthdate;
        boolean sex;

        public Human(String nickname, String password) {
            this.nickname = nickname;
            this.password = password;
        }

        public Human(Date birthdate, boolean sex) {

            this.birthdate = birthdate;
            this.sex = sex;
        }

        public Human(String lastname, String password, boolean sex) {

            this.lastname = lastname;
            this.password = password;
            this.sex = sex;
        }

        public Human(String firstname, String nickname, Date birthdate) {

            this.firstname = firstname;
            this.nickname = nickname;
            this.birthdate = birthdate;
        }

        public Human(String firstname) {
            this.firstname = firstname;
        }

        public Human(String password, Date birthdate, boolean sex) {

            this.password = password;
            this.birthdate = birthdate;
            this.sex = sex;
        }

        public Human(String nickname, String password, Date birthdate, boolean sex) {

            this.nickname = nickname;
            this.password = password;
            this.birthdate = birthdate;
            this.sex = sex;
        }

        public Human(String firstname, String nickname, String password) {

            this.firstname = firstname;
            this.nickname = nickname;
            this.password = password;
        }

        public Human() {

        }

        public Human(String firstname, String lastname, String nickname, String password, Date birthdate, boolean sex) {

            this.firstname = firstname;
            this.lastname = lastname;
            this.nickname = nickname;
            this.password = password;
            this.birthdate = birthdate;
            this.sex = sex;
        }
    }
}
