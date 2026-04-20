package com.yigit.java101;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int a = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = scanner.nextInt();

        int x = a, y = b;
        while (y != 0) {
            int kalan = x % y;
            x = y;
            y = kalan;
        }

        int ebob = x;
        int ekok = (a * b) / ebob;

        System.out.println("EBOB(" + a + ", " + b + ") = " + ebob);
        System.out.println("EKOK(" + a + ", " + b + ") = " + ekok);
    }
}
