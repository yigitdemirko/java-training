package com.yigit.java101;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        return salary >= 1000 ? salary * 0.03 : 0;
    }

    public double bonus() {
        return workHours > 40 ? (workHours - 40) * 30.0 : 0;
    }

    public double raiseSalary() {
        int years = 2021 - hireYear;
        if (years > 19) return salary * 0.15;
        if (years > 9)  return salary * 0.10;
        return salary * 0.05;
    }

    @Override
    public String toString() {
        double netSalary   = salary - tax() + bonus();
        double totalSalary = netSalary + raiseSalary();

        return "Adı : " + name + "\n" +
               "Maaşı : " + salary + "\n" +
               "Çalışma Saati : " + workHours + "\n" +
               "Başlangıç Yılı : " + hireYear + "\n" +
               "Vergi : " + tax() + "\n" +
               "Bonus : " + bonus() + "\n" +
               "Maaş Artışı : " + raiseSalary() + "\n" +
               "Vergi ve Bonuslar ile birlikte maaş : " + netSalary + "\n" +
               "Toplam Maaş : " + totalSalary;
    }

    public static void main(String[] args) {
        Employee e = new Employee("kemal", 2000, 45, 1985);
        System.out.println(e);
    }
}
