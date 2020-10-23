package ru.itsjava.stat;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Salary {
    private final double baseSalary;
    public static int increaseCoefficient;

    public double getFullSalary() {
        return baseSalary * increaseCoefficient;
    }


}
