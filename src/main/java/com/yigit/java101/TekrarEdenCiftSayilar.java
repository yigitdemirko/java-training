package com.yigit.java101;

public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 6, 4, 8, 6, 6, 9};

        System.out.print("Tekrar eden çift sayılar: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) continue;

            boolean tekrarEdiyor = false;
            boolean oncePrint = false;

            for (int j = 0; j < numbers.length; j++) {
                if (i == j) continue;
                if (numbers[j] == numbers[i]) tekrarEdiyor = true;
                if (j < i && numbers[j] == numbers[i]) oncePrint = true;
            }

            if (tekrarEdiyor && !oncePrint) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}
