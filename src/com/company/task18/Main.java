package com.company.task18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину расстояние сантиметрах: ");

        int l = scanner.nextInt();

        System.out.println("Полных метров: " + l / 100);
    }
}
