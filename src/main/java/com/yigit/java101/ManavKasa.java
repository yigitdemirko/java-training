package com.yigit.java101;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double armutFiyat   = 2.14;
        double elmaFiyat    = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat     = 0.95;
        double patlicanFiyat = 5.00;

        System.out.print("Armut Kaç Kilo ? :");
        double armut = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        double elma = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        double domates = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        double muz = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        double patlican = scanner.nextDouble();

        double toplam = (armut * armutFiyat) +
                (elma * elmaFiyat) +
                (domates * domatesFiyat) +
                (muz * muzFiyat) +
                (patlican * patlicanFiyat);

        System.out.printf("Toplam Tutar : %.2f TL%n", toplam);
    }
}