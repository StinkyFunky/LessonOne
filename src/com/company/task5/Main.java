package com.company.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter university: ");
        String university = scanner.nextLine();

        System.out.println("Enter faculty: ");
        String faculty = scanner.nextLine();

        System.out.println("Enter subject: ");
        String subject = scanner.nextLine();

        System.out.println("University: " + university);
        System.out.println("Faculty: " + faculty);
        System.out.println("Subject: " + subject);
    }
}
