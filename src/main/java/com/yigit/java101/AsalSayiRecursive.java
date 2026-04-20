package com.yigit.java101;

import java.util.Scanner;

public class AsalSayiRecursive {
    static boolean isAsal(int n, int divisor) {
        if (n < 2) return false;
        if (divisor > Math.sqrt(n)) return true;
        if (n % divisor == 0) return false;
        return isAsal(n, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int n = scanner.nextInt();

        if (isAsal(n, 2)) {
            System.out.println(n + " sayısı ASALDIR !");
        } else {
            System.out.println(n + " sayısı ASAL değildir !");
        }
    }
}
