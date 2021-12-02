package com.company.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру в Цельсиях: ");

        double t = scanner.nextDouble();
        double result = 32 + (1.8 * t);

        System.out.println("Тепмература в Форенгейтах: " + result);
    }
}
