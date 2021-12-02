package com.company.task22;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите радиус: ");

        double r = scanner.nextDouble();
        double pi = 3.14;

        System.out.println("Длинна окружности: " + (2 * pi * r));
        System.out.println("Площадь окружности: " + (pi * pow(r, 2)));
    }
}
