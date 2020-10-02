package ru.itsjava.oop;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Giraffe {
    private final String name;
    private int neckLength;

//    public Giraffe(String name) {
//        this.name = name;
//    }
//
//    public int getNeckLength() {
//        return neckLength;
//    }
//
//    public void setNeckLength(int neckLength) {
//        this.neckLength = neckLength;
//    }
}