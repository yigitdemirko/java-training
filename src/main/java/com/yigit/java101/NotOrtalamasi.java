package com.yigit.java101;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik: ");
        int matematik = scanner.nextInt();

        System.out.print("Fizik: ");
        int fizik = scanner.nextInt();

        System.out.print("Kimya: ");
        int kimya = scanner.nextInt();

        System.out.print("Türkçe: ");
        int turkce = scanner.nextInt();

        System.out.print("Tarih: ");
        int tarih = scanner.nextInt();

        System.out.print("Müzik: ");
        int muzik = scanner.nextInt();

        int ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Ortalama: " + ortalama);
        System.out.println(ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}