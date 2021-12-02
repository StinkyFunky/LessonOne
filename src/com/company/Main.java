package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello World!");
        //System.out.print("Hello World!");
        //System.out.println(12);

        byte b = 127;
        short s = 246;
        int i = 10000;
        long l = 1000000;
        float f = 12.12f;
        double d = 12.22;

        char c = 'q'; // only 1 symbol
        boolean bn = true;
        String str = "wqewqewqewqew123wqe";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input name: ");

        String name = scanner.nextLine();

        int age = scanner.nextInt();

        System.out.println("Hello " + name + "\n" + "Your age: " + age);
    }
}
