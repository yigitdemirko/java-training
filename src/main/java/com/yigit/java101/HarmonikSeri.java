package com.yigit.java101;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = scanner.nextInt();

        double toplam = 0;
        for (int i = 1; i <= n; i++) {
            toplam += 1.0 / i;
        }

        System.out.println("H(" + n + ") = " + toplam);
    }
}
