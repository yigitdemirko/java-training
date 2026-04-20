package com.yigit.java101;

import java.util.Scanner;

public class BesEksiEkle {
    static void hesapla(int n) {
        System.out.print(n + " ");
        if (n > 0) {
            hesapla(n - 5);
            System.out.print((n - 5) + 5 + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        System.out.print("Çıktısı: ");
        hesapla(n);
        System.out.println();
    }
}
