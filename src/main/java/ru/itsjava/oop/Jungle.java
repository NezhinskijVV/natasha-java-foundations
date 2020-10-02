package ru.itsjava.oop;

public class Jungle {

    public static void main(String[] args) {
        Lion leva = new Lion();

        Cat bagira = new Panther("Bagira");
        bagira.sayMeow();

        System.out.println(bagira.getVoice());
    }
}
