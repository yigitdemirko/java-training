package com.yigit.java101;

public class MatrisTranspoz {
    public static void main(String[] args) {
        int[][] matris = {
            {2, 3, 4},
            {5, 6, 4}
        };

        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        int[][] transpoz = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris : ");
        for (int[] satir : matris) {
            for (int eleman : satir) {
                System.out.printf("%-5d", eleman);
            }
            System.out.println();
        }

        System.out.println("Transpoze : ");
        for (int[] satir : transpoz) {
            for (int eleman : satir) {
                System.out.printf("%-5d", eleman);
            }
            System.out.println();
        }
    }
}
