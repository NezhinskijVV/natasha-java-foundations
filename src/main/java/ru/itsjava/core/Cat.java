package ru.itsjava.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Data
public class Cat {
    private final String nickname;
    private double weight;

    public String sayMeow() {
        return "Meoww";
    }
}
