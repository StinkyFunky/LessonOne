package com.company.task21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите диаметр: ");

        double d = scanner.nextDouble();

        double pi = 3.14;

        System.out.println("Длинна окружности: " + (pi * d));
    }
}
