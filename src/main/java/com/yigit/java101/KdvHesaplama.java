package com.yigit.java101;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fiyat: ");
        double fiyat = scanner.nextDouble();

        double kdvOrani = fiyat <= 1000 ? 0.18 : 0.08;
        double kdvTutari = fiyat * kdvOrani;
        double kdvliFiyat = fiyat + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + fiyat);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);
    }
}