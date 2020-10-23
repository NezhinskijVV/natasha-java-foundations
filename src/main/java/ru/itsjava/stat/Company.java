package ru.itsjava.stat;

public class Company {

    public static void main(String[] args) {


        Salary salary = new Salary(50.0);
        Salary.increaseCoefficient = 5;
        System.out.println("salary.getFullSalary() = " + salary.getFullSalary());

    }
}
