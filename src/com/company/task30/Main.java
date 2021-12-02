package com.company.task30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите трехзначное число: ");

        int a = scanner.nextInt();

        System.out.println(a % 10);
        System.out.println(a % 100 / 10);
    }
}
