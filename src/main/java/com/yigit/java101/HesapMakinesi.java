package com.yigit.java101;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        double a = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double b = scanner.nextDouble();

        System.out.print("İşlem seçiniz (+, -, *, /): ");
        String islem = scanner.next();

        double sonuc;
        switch (islem) {
            case "+":
                sonuc = a + b;
                System.out.println("Sonuç: " + sonuc);
                break;
            case "-":
                sonuc = a - b;
                System.out.println("Sonuç: " + sonuc);
                break;
            case "*":
                sonuc = a * b;
                System.out.println("Sonuç: " + sonuc);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Sıfıra bölme hatası.");
                } else {
                    sonuc = a / b;
                    System.out.println("Sonuç: " + sonuc);
                }
                break;
            default:
                System.out.println("Geçersiz işlem.");
        }
    }
}
