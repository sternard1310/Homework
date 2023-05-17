package Homework;

import java.util.Scanner;
//19.05.2023
public class HomeworkEnum {
    public static void main(String[] args) {
//        Задача "Длительность месяца":
//        Напишите метод, который принимает на
//        вход номер значение месяца enum и выводит количество
//        дней в этом месяце.
//        Необходимо написать enum с перечислением всех месяцев.
//        Количество дней в феврале 28.
        dateOfMonths(11);
    }

    private enum Months {
        APRIL(1), AUGUST(2), DECEMBER(3),
        FEBRUARY(4), JANUARY(5),
        JULY(6), JUNE(7), MARCH(8), MAY(9),
        NOVEMBER(10), OCTOBER(11), SEPTEMBER(12);

        private final int value;
        /*
         я вообще не понял как это работает(
         для меня это 2 приватных метода в enum

        Еще как вы относитесь к LeetCode?
        Стоит ли пробовать решать задания или еще рано?

        И еще я не знаю как кинуть в .java расширении.
        Я могу просто добавить этот класс в гит
        */
        private Months(int value) {
            this.value = value;
        }
    }


    public static String dateOfMonths(int value) {
        int y = value;
        String d1 = "31 days";
        String d0 = "30 days";

        switch (value) {
            case 1 -> System.out.println(d1);
            case 2 -> System.out.println("28 days");
            case 3 -> System.out.println("31 days");
            case 4 -> System.out.println(d0);
            case 5 -> System.out.println("31 days");
            case 6 -> System.out.println("30 days");
            case 7 -> System.out.println("31 days");
            case 8 -> System.out.println("31 days");
            case 9 -> System.out.println("30 days");
            case 10 -> System.out.println("31 days");
            case 11 -> System.out.println("30 days");
            case 12 -> System.out.println("31 days");
        }
        return d1;
    }
}