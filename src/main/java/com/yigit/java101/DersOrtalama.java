package com.yigit.java101;

import java.util.Scanner;

public class DersOrtalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        int gecmeNotu = 55;

        double toplam = 0;
        int gecerliDersSayisi = 0;

        for (String ders : dersler) {
            System.out.print(ders + " notu: ");
            int not = scanner.nextInt();

            if (not < 0 || not > 100) {
                System.out.println("Geçersiz not, ortalamaya katılmıyor.");
                continue;
            }

            toplam += not;
            gecerliDersSayisi++;
        }

        if (gecerliDersSayisi == 0) {
            System.out.println("Geçerli not girilmedi.");
            return;
        }

        double ortalama = toplam / gecerliDersSayisi;
        System.out.printf("Ortalama: %.2f%n", ortalama);
        System.out.println(ortalama >= gecmeNotu ? "Geçti." : "Kaldı.");
    }
}
