package com.yigit.java101;

public class HarmonikOrtalama {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        double harmonikSeri = 0;
        for (int i = 0; i < numbers.length; i++) {
            harmonikSeri += 1.0 / numbers[i];
        }

        double harmonikOrtalama = numbers.length / harmonikSeri;
        System.out.println("Harmonik Ortalama: " + harmonikOrtalama);
    }
}
