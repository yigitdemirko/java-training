package com.yigit.java101;

import java.util.Scanner;

public class CinZodyak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        int yil = scanner.nextInt();

        String[] burclar = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz",
                            "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        System.out.println("Çin Zodyağı Burcunuz : " + burclar[yil % 12]);
    }
}
