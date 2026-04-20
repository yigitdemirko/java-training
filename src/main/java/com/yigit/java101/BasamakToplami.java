package com.yigit.java101;

import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int temp = Math.abs(sayi);

        while (temp != 0) {
            toplam += temp % 10;
            temp /= 10;
        }

        System.out.println(sayi + " sayısının basamak toplamı: " + toplam);
    }
}
