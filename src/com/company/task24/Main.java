package com.company.task24;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину окружности: ");

        double l = scanner.nextDouble();
        double pi = 3.14;
        double r = l / (2 * pi);

        System.out.println("Радиус окружности: " + r);
        System.out.println("Площадь окружности: " + (pi * pow(r, 2)));
    }
}
