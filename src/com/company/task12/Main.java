package com.company.task12;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 числа: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double result = pow(a,3) + 2 * pow(b,2) - 3 * (a * b) + pow(c,3);

        System.out.println("Result: " + (int)result);
    }
}
