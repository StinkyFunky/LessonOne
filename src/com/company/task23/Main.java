package com.company.task23;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 2 числа: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Среднее геометрическое: " + (int) sqrt(a * b));
    }
}
