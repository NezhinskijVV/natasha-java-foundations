package ru.itsjava.interfaces;

public class Gin implements Creatable{

    @Override
    public void createWish() {
        System.out.println("Создает все некрасиво");
    }

    @Override
    public void printWish(String wish) {
        System.out.println("Я пишу на песке твое желание: "  + wish);
    }
}
