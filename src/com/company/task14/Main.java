package com.company.task14;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 числа: ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        //x3 + 5xy - 6zy + z3
        double result = pow(x,3) + 5 * (x * y) - 6 * (z * y) + pow(z, 3);

        System.out.println("Result: " + (int)result);
    }
}
