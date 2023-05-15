package Homework;

import java.util.Scanner;
//19.05.2023
public class HomeworkIfElse {
    /* 1 уровень сложности: Задачи на выбор, допустимо выбрать любые
    три. Разбор всех задач у меня в гите, при желании можете решить все 7.
    Логика решению любой задачи:
    А. определить конечный результат -
    есть возвращаемое значение или его нет (печать в консоль)
    В. определить, принимает метод аргументы или нет, если да,
    то какие, сколько и какого типа.
    С. Выполнение какого условия должно быть истинным,
    чтобы попасть в нужный блок if-else?
     */
    public static void main(String[] args) {
        isNumber(0);
//        isOddNumber(4);
//        isYearLeap(2004);
//        isGoodStudent(60);
//        isSeason("K");
//        typeOfTriangle(3,3,3);
//        isNumberMultiple(15);
    }

    public static void isNumber(double x){
//        Напишите метод, который проверяет,
//        является ли заданное число положительным,
//        отрицательным или нулём и печатает ответ в консоль
        double y = x;
        if (x > 0){
            System.out.println("Your number is positive");
        }
        else if (x < 0){
            System.out.println("Your number is negative");
        }
        else {
            System.out.println("Your number is zero");
        }
        return ;
    }
    public static void isOddNumber (double x) { // у меня не считает дробные числа. Это проблема моего кода?
//    Напишите метод, который определяет,
//    является ли заданное число чётным или нечётным и
//    печатает ответ в консоль
        double y = x;
        if (y % 2 == 0){
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is not odd");
        }
        return ;
    }
    public static boolean isYearLeap (int x) {
//    Напишите метод, который проверяет, является ли заданный год
//    високосным или нет. Метод возвращает boolean
//    Год, который делится на 4 без остатка, является високосным,
//    за исключением:
//            -Годов, которые делятся на 100 без остатка.
//    Они не являются високосными, за исключением:
//            -Годов, которые делятся на 400 без остатка.
//    Они являются високосными.
//    для решения используйте вложенные if-else
        boolean z = true;
        int y = x;
        if (y % 4 == 0) {
            System.out.println(z);
        }
        else if (y % 100 != 0){
        System.out.println(!z);
        }
        else if (y % 400 == 0){
        System.out.println(z);
        }
        else {
            System.out.println(!z);
        }
        return z;
      }

      public static void isGoodStudent (int x) {
//    Напишите метод, который определяет оценку студента
//    в зависимости от полученного балла:
//            90-100 - A, 80-89 - B, 70-79 - C, 60-69 - D,
//    меньше 60 - F.
//    Метод принимает число в качестве аргумента и возвращает строку
          int y = x;

          if (y > 100) {
              System.out.println("You couldn`t get more than 100 points");
          } else if (y >= 90) {
              System.out.println("Your mark is A");
          } else if (y >= 80) {
              System.out.println("Your mark is B");
          } else if (y >= 70) {
              System.out.println("Your mark is C");
          } else if (y >= 60) {
              System.out.println("Your mark is D");
          } else {
              System.out.println("Your mark is F");
          }
      }
      
      public static String isSeason (String x) {
//    Напишите метод, который определяет время года
//    (весна, лето, осень, зима) в зависимости от заданного месяца.
//    используйте конструкции if-else-if.
//    Метод принимает строку и возвращает тоже строку
          String Str = "Spring";
          if (x.equalsIgnoreCase("January") || x.equalsIgnoreCase("February") || x.equalsIgnoreCase("December")){
              System.out.println("Now is winter");
          }
          else if (x.equalsIgnoreCase("September") || x.equalsIgnoreCase("October") || x.equalsIgnoreCase("November")){
              System.out.println("Now is autumn");
          }
          else if (x.equalsIgnoreCase("June") || x.equalsIgnoreCase("July") || x.equalsIgnoreCase("August")){
              System.out.println("Now is summer");
          }
          else if (x.equalsIgnoreCase("March") || x.equalsIgnoreCase("April") || x.equalsIgnoreCase("May")){
              System.out.println("Now is spring");
          }
          else {
              System.out.println("It is not a month\nPlease enter the month");
          }
          return Str;
      }


    public static String typeOfTriangle (double x, double y, double z) {
//    Напишите метод, который определяет тип треугольника
//    (равносторонний, равнобедренный, разносторонний) по заданным
//    сторонам и возвращает строку "равносторонний",
//    "равнобедренный" или "разносторонний"
          
          
//    разбор по пунктам на примере задачи 6:
//         
//    А. "метод возвращает строку". должен быть тип
//    возвращаемого значения String
//    B. Методу передают размер сторон трекгольника,
//    следовательно он должен в качестве аргумента принимать 3 числа.
//    Размеры сторон не обязательно должны быть целочисленными,
//    следовательно логично выбрать тип double.
//    С. самое строгое условие - равенство всех трех сторон,
//    его проверим первым, если оно выполнится, то вернем
//    "равносторонний" (блок if)
//    менее строгое словие - равенство двух сторон,
//    если любые две стороны треугольника равны, вернем "равнобедренный"
//    (блок else-if, тк если у нас будет первой стоять
//    проверка на равнобедренность, то все равносторонние треугольники
//    будут помечены, как равнобедренные и мы никогда не узнаем
//    есть ли равносторонние)
//    в случае, если не выполнилось ни первое условие, ни второе,
//    то вернем "разносторонний" (else блок)
        String s1 = "равносторонний";
        String s2 = "равнобедренный";
        String s3 = "разносторонний";


        double x1 = x;
        double y1 = y;
        double z1 = z;
          boolean xy = x == y;
          boolean yz = y == z;
          boolean xz = x == z;

          if (xy && xz && yz){
              System.out.println(s1);
          }

          else if (x1 != z1){
              if (x1 == y1){
                  System.out.println(s2);
              }
              else if (y1 == x1) {
                  System.out.println(s2);
              }
              else if (z1 == y1) {
                  System.out.println(s2);
              }
              else{
                  System.out.println(s3);
              }
          }
          else{
              System.out.println(s3);
          }
          return s1;
      }
    public static void isNumberMultiple (double x) {
//        Напишите метод, который определяет,
//        является ли заданное число кратным 3,
//        5 или обоим и возвращает строку
        double y = x;
        boolean x5 = y % 5 == 0;
        boolean x3 = y % 3 == 0;
        if (x5 && x3){
            System.out.println("Число кратно 3 и 5");
        } else if (y % 3 ==0) {
            System.out.println("Число кратно 3");
        } else if (y % 5 == 0) {
            System.out.println("Число кратно 5");
        } else {
            System.out.println("Число не кратно ни 3, ни 5");
        }
    }
}

