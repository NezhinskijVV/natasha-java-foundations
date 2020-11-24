package ru.itsjava.exceptions;

public class Main {

    public static void main(String[] args) {

        Banana banana = new Banana("Africa", 10.0);

//        try {
//            banana.setWeight(-20);
//        } catch (NotCorrectWeightException e) {
//            System.err.println("Exception from main");
//            e.printStackTrace();
//        }

        banana.setWeight(-20);



    }
}
