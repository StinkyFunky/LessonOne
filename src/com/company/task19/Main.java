package com.company.task19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер файла в байтах: ");

        int x = scanner.nextInt();

        System.out.println("Количество полных килобайт: " + x / 1024);
    }
}
