package ru.itsjava.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Coffee {
    ESPRESSO("ГОРЬКИЙ"), AMERICANO("ОБЫЧНЫЙ"),
    CAPPUCCINO("ГОРЬКИЙ С МОЛОКОМ"), LATE("МЯГКИЙ)))))");

    private final String additional;

    @Override
    public String toString() {
        return this.name() + '(' + additional + ')';
    }
}