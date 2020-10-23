package ru.itsjava.interfaces.comparable;

import java.util.Arrays;

public class School {

    public static void main(String[] args) throws CloneNotSupportedException {
        Pen bestPen = new Pen("blue", 0.5, true);

        System.out.println(bestPen);
        Pen bestPen2 = new Pen("blue", 0.5, true);
        System.out.println(bestPen2);

        System.out.println("bestPen.equals(bestPen2) = " + bestPen.equals(bestPen2));

        System.out.println("bestPen.clone() = " + bestPen.clone());

        Pen pen1 = new Pen("blue", 0.3, true);
        Pen pen2 = new Pen("blue", 0.5, true);
        Pen pen3 = new Pen("blue", 0.4, true);

        Pen[] pens = new Pen[]{pen1, pen2, pen3};
        System.out.println(Arrays.toString(pens));
        Arrays.sort(pens);
        System.out.println(Arrays.toString(pens));


    }
}
//1. Создать класс Person ( Поля: Имя, Фамилия и возраст) + toString() + hashCode() + equals()
//2. Реализовать интерфейс Comparable. Реализовать метод compareTo(), который будет сравнивать человека по фамилии, если фамилии одинаковые, то по имени, в ином случае по возрасту.
//3. В классе Main добавить в массив несколько человек. Отсортировать и вывести на экран.
//4. В классе Person реализовать метод clone()
//5. PersonsComparator (самостоятельно)
//6. Теория (ООП + интерфейсы абстрактные классы и классы)
//7. Фигуры (абстрактный класс)

//https://metanit.com/java/tutorial/2.2.php