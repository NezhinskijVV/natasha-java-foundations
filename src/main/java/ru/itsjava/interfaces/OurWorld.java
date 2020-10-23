package ru.itsjava.interfaces;

public class OurWorld {

    public static void main(String[] args) {
        Gin gin = new Gin();

        Creatable fish = new GoldFish();

//        Person oldMan = new Person(new GoldFish());
//        oldMan.wantSomething("Хочу корыто");

        fish.printWish("Корыто");
        gin.printWish("Корыто");
    }
}

class Person{
    private final Creatable creatable;

    public Person(Creatable creatable) {
        this.creatable = creatable;
    }

    public void wantSomething(String wish){
        creatable.createWish();
    }
}

//1. SOLID: https://ru.wikipedia.org/wiki/SOLID_(объектно-ориентированное_программирование)  (DIP)
//2. Java 8 Что там есть?
//3. Итерфейсы:
////INTERFACE pt1
////1. Создать следующие интерфейсы:
////- Walkable с методом void walk()
////- Swimable с методами void swim(), double maxSwimSpeed()
////- Runnable с методами void run(), int maxRunDistance()
////- Flyable с методами void fly() и String flyMaxDistance()
////2. Создать классы: Man (человек), Dog, Cat, Bird, Fish и реализовать соответствующие интерфейсы
//// 3. Создать Класс Vodka (4 поля)
////- Перегрузить метод void drinkTooMuch()
////- Перегрузить конструкторы (без ломбок)
////4. Реализовать классы из презентации (в дз)