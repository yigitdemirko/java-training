package com.yigit.java101;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafe (KM): ");
        double mesafe = scanner.nextDouble();

        double acilisUcreti = 10;
        double kmBasinaUcret = 2.20;
        double minimumUcret = 20;

        double toplam = acilisUcreti + (mesafe * kmBasinaUcret);
        toplam = toplam < minimumUcret ? minimumUcret : toplam;

        System.out.printf("Taksimetre Tutarı: %.2f TL%n", toplam);
    }
}