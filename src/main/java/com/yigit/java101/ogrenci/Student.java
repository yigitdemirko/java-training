package com.yigit.java101.ogrenci;

public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) this.mat.note = mat;
        if (fizik >= 0 && fizik <= 100) this.fizik.note = fizik;
        if (kimya >= 0 && kimya <= 100) this.kimya.note = kimya;
    }

    public void addBulkSozluNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) this.mat.sozluNotu = mat;
        if (fizik >= 0 && fizik <= 100) this.fizik.sozluNotu = fizik;
        if (kimya >= 0 && kimya <= 100) this.kimya.sozluNotu = kimya;
    }

    public void calcAvarage() {
        this.avarage = (this.mat.getWeightedNote() + this.fizik.getWeightedNote() + this.kimya.getWeightedNote()) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.printf("Ortalama : %.2f%n", this.avarage);
            System.out.println(this.isPass ? "Sınıfı Geçti." : "Sınıfta Kaldı.");
        }
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.printf("Matematik  -> Sınav: %d  Sözlü: %d  Ağırlıklı: %.1f%n",
                mat.note, mat.sozluNotu, mat.getWeightedNote());
        System.out.printf("Fizik      -> Sınav: %d  Sözlü: %d  Ağırlıklı: %.1f%n",
                fizik.note, fizik.sozluNotu, fizik.getWeightedNote());
        System.out.printf("Kimya      -> Sınav: %d  Sözlü: %d  Ağırlıklı: %.1f%n",
                kimya.note, kimya.sozluNotu, kimya.getWeightedNote());
    }
}
