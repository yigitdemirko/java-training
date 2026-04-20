package com.yigit.java101;

import java.util.Scanner;

public class CiftDortKati {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;

        while (true) {
            System.out.print("Sayı giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi % 2 != 0) {
                System.out.println("Tek sayı girildi, program sonlanıyor.");
                break;
            }

            if (sayi % 4 == 0) {
                toplam += sayi;
            }
        }

        System.out.println("Çift ve 4'ün katı sayıların toplamı: " + toplam);
    }
}
