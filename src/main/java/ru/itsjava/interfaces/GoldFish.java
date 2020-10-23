package ru.itsjava.interfaces;

public class GoldFish extends Printer implements Creatable {

    @Override
    public void createWish() {
        System.out.println("Золотая рыбка создает все красиво");
    }
}
