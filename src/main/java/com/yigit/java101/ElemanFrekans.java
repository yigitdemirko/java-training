package com.yigit.java101;

public class ElemanFrekans {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < dizi.length; i++) {
            boolean oncdenSayildi = false;
            for (int j = 0; j < i; j++) {
                if (dizi[j] == dizi[i]) {
                    oncdenSayildi = true;
                    break;
                }
            }
            if (oncdenSayildi) continue;

            int frekans = 0;
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[j] == dizi[i]) frekans++;
            }
            System.out.println(dizi[i] + " sayısı " + frekans + " kere tekrar edildi.");
        }
    }
}
