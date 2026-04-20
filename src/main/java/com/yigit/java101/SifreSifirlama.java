package com.yigit.java101;

import java.util.Scanner;

public class SifreSifirlama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mevcutSifre = "java101";

        System.out.print("Şifrenizi giriniz: ");
        String girilen = scanner.nextLine();

        if (girilen.equals(mevcutSifre)) {
            System.out.println("Giriş başarılı.");
            return;
        }

        System.out.println("Şifre yanlış.");
        System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
        String cevap = scanner.nextLine();

        if (!cevap.equalsIgnoreCase("evet")) {
            System.out.println("İşlem iptal edildi.");
            return;
        }

        System.out.print("Yeni şifrenizi giriniz: ");
        String yeniSifre = scanner.nextLine();

        if (yeniSifre.equals(mevcutSifre)) {
            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
        } else {
            System.out.println("Şifre oluşturuldu.");
        }
    }
}
