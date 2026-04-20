package com.yigit.java101;

import java.util.Scanner;

public class MaxMinBulucu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        System.out.print("1. Sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        int max = sayi;
        int min = sayi;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = scanner.nextInt();
            if (sayi > max) max = sayi;
            if (sayi < min) min = sayi;
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
