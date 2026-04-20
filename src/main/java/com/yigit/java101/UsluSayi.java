package com.yigit.java101;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban giriniz: ");
        int taban = scanner.nextInt();
        System.out.print("Üs giriniz: ");
        int us = scanner.nextInt();

        long sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }

        System.out.println(taban + "^" + us + " = " + sonuc);
    }
}
