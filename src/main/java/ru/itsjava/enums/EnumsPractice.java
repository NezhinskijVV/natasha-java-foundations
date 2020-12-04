package ru.itsjava.enums;

import java.util.Arrays;

public class EnumsPractice {

    public static void main(String[] args) {
        System.out.println("Season.WINTER = " + Season.WINTER);

        Season[] seasons = Season.values();
        System.out.println(Arrays.toString(seasons));

        Season season = Season.valueOf("SPRING");
        System.out.println(season);

        switch (season) {
            case SPRING:
                System.out.println("У нас весна");
                break;
            case FALL:
                System.out.println("У нас осень");
                break;
            default:
                System.out.println("У нас не весна не осень");
        }


        Coffee americano = Coffee.AMERICANO;
        System.out.println(americano.getAdditional());

        System.out.println(americano);
    }
}
