package com.company.task28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int a = scanner.nextInt();

        if(a % 2 == 0) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
