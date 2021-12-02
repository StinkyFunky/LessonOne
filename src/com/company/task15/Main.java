package com.company.task15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 2 числа: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a > b);
    }
}
