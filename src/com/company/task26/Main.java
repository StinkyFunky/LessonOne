package com.company.task26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int x = scanner.nextInt();
        int y = 4 * (x - 3) - 7 * ( x - 3) + 2;
        System.out.println("y = " + y);
    }
}
