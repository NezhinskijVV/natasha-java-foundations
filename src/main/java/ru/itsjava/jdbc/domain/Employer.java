package ru.itsjava.jdbc.domain;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Employer {
    private final String name;
    private final int age;

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}