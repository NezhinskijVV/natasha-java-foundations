package ru.itsjava.exceptions;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class Banana {
    private final String country;
    private double weight;

    @SneakyThrows
    public void setWeight(double weight) {
        if (weight < 0) {
            throw new NotCorrectWeightException();
        }
        this.weight = weight;
    }
}
