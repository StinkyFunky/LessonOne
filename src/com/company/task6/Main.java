package com.company.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 числа: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("a + b + c = " + (a + b + c));
        System.out.println("a - b - c = " + (a - b - c));
        System.out.println("a * b * c = " + (a * b * c));
    }
}
