package com.company.task8;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.println((int) pow(a,2));
        System.out.println((int) pow(a,3));
    }
}
