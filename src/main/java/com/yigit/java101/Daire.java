package com.yigit.java101;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;

        System.out.print("Yarıçap (r): ");
        double r = scanner.nextDouble();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        System.out.printf("Alan: %.2f%n", alan);
        System.out.printf("Çevre: %.2f%n", cevre);

        // Daire Dilimi
        System.out.print("Merkez açısı (α): ");
        double alfa = scanner.nextDouble();

        double dilimAlani = (pi * (r * r) * alfa) / 360;
        System.out.printf("Daire Dilimi Alanı: %.2f%n", dilimAlani);
    }
}