package com.yigit.java101;

import java.util.Scanner;

public class BolunenOrtalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int n = scanner.nextInt();

        int toplam = 0;
        int adet = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        if (adet == 0) {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        } else {
            System.out.println("Ortalama: " + (double) toplam / adet);
        }
    }
}
