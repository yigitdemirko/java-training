package com.yigit.java101;

import java.util.Scanner;

public class Kombinasyon {
    static long faktoriyel(int n) {
        long sonuc = 1;
        for (int i = 2; i <= n; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = scanner.nextInt();
        System.out.print("r değerini giriniz: ");
        int r = scanner.nextInt();

        if (r > n || r < 0 || n < 0) {
            System.out.println("Geçersiz değer.");
            return;
        }

        long kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
    }
}
