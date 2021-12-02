package com.company.task25;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int x = scanner.nextInt();
        int y = 3 * (int) pow(x, 2) - (6 * x) - 7;
        System.out.println("y = " + y);
    }
}
