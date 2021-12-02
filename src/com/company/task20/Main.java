package com.company.task20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите трехзначное число: ");

        int x = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += x % 10;
            x /= 10;
        }

        System.out.println("Сумма: " + sum);
    }
}
