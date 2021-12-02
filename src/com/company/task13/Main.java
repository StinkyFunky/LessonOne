package com.company.task13;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 числа: ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        double result = pow(x,4) + 4 * (x * pow(y, 2)) - 4 * (y * z) + pow(z, 4);

        System.out.println("Result: " + (int)result);
    }
}
