package com.yigit.java101;

import java.util.Scanner;

public class GelisMisHesapMakinesi {
    static Scanner scan = new Scanner(System.in);

    static void plus() {
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = scan.nextInt();
            if (number == 0) break;
            result += number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void minus() {
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = scan.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = scan.nextInt();
            if (i == 1) { result = number; continue; }
            result -= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void times() {
        int number, result = 1, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = scan.nextInt();
            if (number == 1) break;
            if (number == 0) { result = 0; break; }
            result *= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void divided() {
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = scan.nextInt();
        double number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = scan.nextDouble();
            if (i != 1 && number == 0) { System.out.println("Böleni 0 giremezsiniz."); continue; }
            if (i == 1) { result = number; continue; }
            result /= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void power() {
        System.out.print("Taban değeri giriniz: ");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int exponent = scan.nextInt();
        long result = 1;
        for (int i = 1; i <= exponent; i++) result *= base;
        System.out.println("Sonuç: " + result);
    }

    static void factorial() {
        System.out.print("Sayı giriniz: ");
        int n = scan.nextInt();
        long result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        System.out.println("Sonuç: " + result);
    }

    static void mod() {
        System.out.print("1. sayı: ");
        int a = scan.nextInt();
        System.out.print("2. sayı: ");
        int b = scan.nextInt();
        if (b == 0) {
            System.out.println("Mod sıfır olamaz.");
            return;
        }
        System.out.println("Sonuç: " + a % b);
    }

    static void dikdortgen() {
        System.out.print("Uzunluk: ");
        double uzunluk = scan.nextDouble();
        System.out.print("Genişlik: ");
        double genislik = scan.nextDouble();
        System.out.println("Alan   : " + uzunluk * genislik);
        System.out.println("Çevre  : " + 2 * (uzunluk + genislik));
    }

    public static void main(String[] args) {
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktöriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = scan.nextInt();
            switch (select) {
                case 1: plus();       break;
                case 2: minus();      break;
                case 3: times();      break;
                case 4: divided();    break;
                case 5: power();      break;
                case 6: factorial();  break;
                case 7: mod();        break;
                case 8: dikdortgen(); break;
                case 0: System.out.println("Çıkış yapılıyor."); break;
                default: System.out.println("Yanlış değer, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
