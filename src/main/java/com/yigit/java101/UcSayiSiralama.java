package com.yigit.java101;

import java.util.Scanner;

public class UcSayiSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        int a = scanner.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int b = scanner.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        int c = scanner.nextInt();

        int min, mid, max;

        if (a <= b && a <= c) {
            min = a;
            if (b <= c) { mid = b; max = c; }
            else         { mid = c; max = b; }
        } else if (b <= a && b <= c) {
            min = b;
            if (a <= c) { mid = a; max = c; }
            else         { mid = c; max = a; }
        } else {
            min = c;
            if (a <= b) { mid = a; max = b; }
            else         { mid = b; max = a; }
        }

        System.out.println("Sıralama: " + min + " " + mid + " " + max);
    }
}
