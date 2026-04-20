package com.yigit.java101;

import java.util.Scanner;

public class EnYakinSayi {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi = scanner.nextInt();

        Integer kucukEnYakin = null;
        Integer buyukEnYakin = null;

        for (int i : list) {
            if (i < sayi) {
                if (kucukEnYakin == null || i > kucukEnYakin) {
                    kucukEnYakin = i;
                }
            } else if (i > sayi) {
                if (buyukEnYakin == null || i < buyukEnYakin) {
                    buyukEnYakin = i;
                }
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + kucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + buyukEnYakin);
    }
}
