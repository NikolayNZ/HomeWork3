package com.gmail.lesson3HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Написать программу которая считает 4 числа c клавиатуры и выведет на
экран самое большое из них.*/
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int max;
        System.out.println("Введите число a");
        a = sc.nextInt();
        System.out.println("Введите число b");
        b = sc.nextInt();
        System.out.println("Введите число c");
        c = sc.nextInt();
        System.out.println("Введите число d");
        d = sc.nextInt();

        max = a;
        if (b > max) {
            max = b;
        }
        if (c > b) {
            max = c;
        }
        if (d > c) {
            max = d;
        }
        System.out.println("Max = " + max);

        /*Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда
начинается с единицы. На одном этаже 4 квартиры. Напишите программу
которая получит номер квартиры с клавиатуры, и выведет на экран на
каком этаже, какого подъезда расположенна эта квартира. Если такой
квартиры нет в этом доме то нужно сообщить об этом пользователю.*/

        Scanner scf = new Scanner(System.in);

        double flat;
        double floor = 9;
        double entrance = 4;
        double apartments = 4;
        double maximum = floor * entrance * apartments;
        double apartments_entrance = maximum / entrance;

        System.out.println("Введите номер квартиры");
        flat = scf.nextDouble();

        if (flat <= maximum) {
            double entrance1  = Math.ceil(flat / (apartments_entrance));

            System.out.println("Подъезд № " +(short) + entrance1);

             double floor1 = (flat - apartments_entrance * (entrance1 - 1) - 1) / 4 + 1;


            System.out.println("Этаж № " +(short) + floor1);
        } else {
            System.out.println("Такого номера квартиры в этом доме НЕТ");
        }

        /*Определить количество дней в году, который вводит пользователь.
        В високосном годе - 366 дней, тогда как в обычном 365. Високосный
        год определяется по следующему правилу: Год високосный, если он делится на четыре без остатка, но если он
        делится на 100 без остатка, это не високосный год. Однако, если он
        делится без остатка на 400, это високосный год.*/
        Scanner year  = new Scanner(System.in);
        int years;
        System.out.println("Введите год");
        years = year.nextInt();

        int year366 = years % 4;
        int years366 = years % 400;
        int year365 = years % 100;

        if (year366 < 1 && year365 >=1) {
            System.out.println("В этом году 366 дней");
        }else if (years366 < 1){
            System.out.println("В этом году 366 дней");
        } else {
            System.out.println("В этом году 365 дней");
        }
        /*Треугольник существует только тогда, когда сумма любых двух его
        сторон больше третьей. Дано: a, b, c – стороны предполагаемого
        треугольника. Напишите программу которая укажет существует такой
        треугольник или нет.*/

        Scanner sct = new Scanner(System.in);
        System.out.println("Введите размер первой стороны треугольника");
        double a1 = sct.nextInt();
        System.out.println("Введите размер второй стороны треугольника");
        double b1 = sct.nextInt();
        System.out.println("Введите размер третьей стороны треугольника");
        double c1 = sc.nextInt();

        if ((a1 + b1) > c1 && (b1+c1) > a1 && (c1 + a1) > b1 ) {
            System.out.println("Треугольник с данными размерами существует");
        } else {
            System.out.println("Данные размеры не подходят треугольнику");
        }


    }
}


