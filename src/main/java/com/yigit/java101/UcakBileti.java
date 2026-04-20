package com.yigit.java101;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        double mesafe = scanner.nextDouble();
        System.out.print("Yaşınızı giriniz : ");
        int yas = scanner.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int tip = scanner.nextInt();

        if (mesafe <= 0 || yas <= 0 || (tip != 1 && tip != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        double normalTutar = mesafe * 0.10;

        double yasIndirimOrani = 0;
        if (yas < 12)       yasIndirimOrani = 0.50;
        else if (yas <= 24) yasIndirimOrani = 0.10;
        else if (yas > 65)  yasIndirimOrani = 0.30;

        double indirimliTutar = normalTutar - (normalTutar * yasIndirimOrani);

        double toplam;
        if (tip == 2) {
            double gidisInd = indirimliTutar * 0.20;
            toplam = (indirimliTutar - gidisInd) * 2;
        } else {
            toplam = indirimliTutar;
        }

        System.out.println("Toplam Tutar = " + toplam + " TL");
    }
}
