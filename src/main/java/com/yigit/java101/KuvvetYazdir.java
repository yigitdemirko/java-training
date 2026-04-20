package com.yigit.java101;

import java.util.Scanner;

public class KuvvetYazdir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        long n = scanner.nextLong();

        System.out.println("4'ün kuvvetleri:");
        long kuvvet4 = 1;
        for (int i = 0; kuvvet4 <= n; i++) {
            System.out.println("4^" + i + " = " + kuvvet4);
            kuvvet4 *= 4;
        }

        System.out.println("5'in kuvvetleri:");
        long kuvvet5 = 1;
        for (int i = 0; kuvvet5 <= n; i++) {
            System.out.println("5^" + i + " = " + kuvvet5);
            kuvvet5 *= 5;
        }
    }
}
