package com.yigit.java101;

import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hipotenüs
        System.out.print("1. dik kenar: ");
        double a = scanner.nextDouble();

        System.out.print("2. dik kenar: ");
        double b = scanner.nextDouble();

        double hip = Math.sqrt(a * a + b * b);
        System.out.println("Hipotenüs: " + hip);

        // Üçgen Alanı
        System.out.print("3. kenar: ");
        double c = scanner.nextDouble();

        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Alan: " + alan);
    }
}