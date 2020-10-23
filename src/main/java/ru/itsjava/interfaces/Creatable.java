package ru.itsjava.interfaces;

public interface Creatable {
    String I_AM_CONST = "CONSTANTA";
    void createWish();

    default void printWish(String wish){
        System.out.println(wish + " from Creatable");
    }
}