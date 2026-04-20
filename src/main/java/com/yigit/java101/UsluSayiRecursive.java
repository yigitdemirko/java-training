package com.yigit.java101;

import java.util.Scanner;

public class UsluSayiRecursive {
    static long power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int base = scanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exp = scanner.nextInt();

        System.out.println("Sonuç: " + power(base, exp));
    }
}
