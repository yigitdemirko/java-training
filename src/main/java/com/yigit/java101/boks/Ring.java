package com.yigit.java101.boks;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (!checkWeight()) {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
            return;
        }

        Fighter first = determineFirstFighter();
        Fighter second = first == f1 ? f2 : f1;
        System.out.println("İlk vuruşu yapacak sporcu: " + first.name);

        while (f1.health > 0 && f2.health > 0) {
            System.out.println("======== YENİ ROUND ===========");
            second.health = first.hit(second);
            if (isWin()) break;
            first.health = second.hit(first);
            if (isWin()) break;
            printScore();
        }
    }

    // %50 olasılıkla ilk dövüşecek sporcuyu belirler
    public Fighter determineFirstFighter() {
        return Math.random() < 0.5 ? f1 : f2;
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight)
                && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
