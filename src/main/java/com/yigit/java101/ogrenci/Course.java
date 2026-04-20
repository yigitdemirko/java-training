package com.yigit.java101.ogrenci;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNotu;
    double sozluEtkiYuzdesi;

    public Course(String name, String code, String prefix, double sozluEtkiYuzdesi) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.sozluEtkiYuzdesi = sozluEtkiYuzdesi;
        this.note = 0;
        this.sozluNotu = 0;
    }

    public double getWeightedNote() {
        return (sozluNotu * sozluEtkiYuzdesi) + (note * (1 - sozluEtkiYuzdesi));
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
