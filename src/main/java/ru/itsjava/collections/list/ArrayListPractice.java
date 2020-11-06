package ru.itsjava.collections.list;

import ru.itsjava.collections.Watch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {


    public static void main(String[] args) {
//        List<Watch> watches = new ArrayList<>();

        Watch vitaliyWatch = new Watch("Seiko", "Vitaliy", 18_000);
        Watch natashaWatch = new Watch("Apple", "Natasha", 25_000);
        Watch dmitriyWatch = new Watch("Omega", "Dmitriy", 100_000);
//        watches.add(vitaliyWatch);
//        watches.add(natashaWatch);
//        watches.add(dmitriyWatch);

        List<Watch> watches = new ArrayList<>(Arrays.asList(vitaliyWatch, natashaWatch, dmitriyWatch));
        System.out.println("Наши часы: " + watches);

        watches.remove(0);
        System.out.println(watches);

        System.out.println("watches.contains(vitaliyWatch) = " + watches.contains(vitaliyWatch));
        System.out.println("watches.get(0).getAuthor() = " + watches.get(0).getAuthor());

        System.out.println("watches.isEmpty() = " + watches.isEmpty());
        System.out.println("watches.size() = " + watches.size());


        //вывести все часы у которых цена < 30_000
        for (Watch elemWatch: watches){
            if (elemWatch.getPrice() < 30_000){
                System.out.print(elemWatch + " ");
            }
        }

        watches.add(0, vitaliyWatch);
    }
}


//
//0. Содание списков: (Используя конструктор)
//        а). Создать пустой список
//        б). Создать список размером 20
//

//
//        2. Задачи на вставку элемента:
//        а) Добавить подряд 5 элементов.
//        б) Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.
//        в) Записать в новый список все элементы предыдущего списка.

//        1. Получить элемент по индексу:
//        а). Получить первый элемент
//        б). Получить последний элемент
//
//        3. Задачи на удаление элементов: (Используя методы)
//        а) Удалить элемент по значению
//        б) Удалить элемент по индексу
//
//        4. Проверить наличие элемента
//
//        5. Вывод списка:
//        а) Вывести список на экран в формате: List: {"First";"Second";"Third"}
//
//        6. Отфильтровать список вернуть записи по некоторому условию:
//        а) Условие на индекс: Индекс делится на 3
//        б) Условие на значение: Вернуть количество элементов, которые равны "***"
//
//        7. Пропустить несколько первых элементов
//        а) Пропустить первые 3 элемента в списке.
//
//        6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию
//        а) Пропустить первые 2 элемента, которые равные "****"
//
//        8. Вернуть первый подходящий элемент:
//        а) Возращаем Первый элемент возраст которого делится на 3.
//
//        9. Возвращаем все элементы удовлетворяющие условию:
//        а) Возвращаем все элементы делятся на 3
//
//        10. Создать класс Person.
//        Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на Н
//
//        11. Найти средний возраст всех женщин.
//
//isEmpty(), contains(), clear()
