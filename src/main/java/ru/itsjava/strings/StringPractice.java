package ru.itsjava.strings;

public class StringPractice {

    public static void main(String[] args) {
//        String str = "";
//        for (long i = 0; i < 1_000_000L; i++) {
//            str = str + "!";
//        }
//        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder("");
        for (long i = 0; i < 1_000_000L; i++) {
            stringBuilder.append("!");
        }
        System.out.println(stringBuilder);

    }
}
//Junit 5
// beforeEach, beforeAll

//Тесты
//1.Написать свой класс Person с полями имя,возраст
//2.Метод void birthday()(который увеличивает возраст на 1)
// и boolean takeBeer(),который проверяет возраст и выдает true если возраст больше 18и false в ином случае
//3.Написать все возможные тесты на этот класс

//Поиграться с методами класса String. (кроме CodePoint lines) String str = "Я классная строка, поиграйся со мной!"