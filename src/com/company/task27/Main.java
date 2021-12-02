package com.company.task27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 стороны прямоугольного параллелепипеда: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("Объём: " + (a * b * c));
        System.out.println("Площадь: " + (2 * (a * b + b * c + a * c)));
    }
}
