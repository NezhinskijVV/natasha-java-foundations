package ru.itsjava.collections.list.linkedlist;

public class MyLinkedListPractice {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add("Строка 1");
        list.add("Строка 2");
        list.add("Строка 3");
        list.add("Строка 4");

        System.out.println("list = " + list);

        list.remove("Строка 4");
        System.out.println("list = " + list);

        System.out.println(list.get(0));
        System.out.println("СПИСОК = " + list);
        list.add(1, "Строка 1,5");
        System.out.println("list = " + list);

        list.add(0, "Строка 0");
        System.out.println("list = " + list);

        list.add(4, "Строка 2.5");
        System.out.println("list = " + list);




    }
}
