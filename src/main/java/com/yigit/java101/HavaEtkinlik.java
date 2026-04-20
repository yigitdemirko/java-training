package com.yigit.java101;

import java.util.Scanner;

public class HavaEtkinlik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz: ");
        int sicaklik = scanner.nextInt();

        // Çözüm 1: if-else if
        System.out.print("if-else if     -> ");
        if (sicaklik < 5) {
            System.out.println("Kayak");
        } else if (sicaklik <= 15) {
            System.out.println("Sinema");
        } else if (sicaklik <= 25) {
            System.out.println("Piknik");
        } else {
            System.out.println("Yüzme");
        }

        // Çözüm 2: switch-case (aralıkları kategoriye dönüştürerek)
        System.out.print("switch-case    -> ");
        int kategori = sicaklik < 5 ? 0 : sicaklik <= 15 ? 1 : sicaklik <= 25 ? 2 : 3;
        switch (kategori) {
            case 0: System.out.println("Kayak");   break;
            case 1: System.out.println("Sinema");  break;
            case 2: System.out.println("Piknik");  break;
            default: System.out.println("Yüzme");
        }

        // Çözüm 3: ternary zinciri
        System.out.print("ternary        -> ");
        String etkinlik = sicaklik < 5 ? "Kayak"
                        : sicaklik <= 15 ? "Sinema"
                        : sicaklik <= 25 ? "Piknik"
                        : "Yüzme";
        System.out.println(etkinlik);
    }
}
