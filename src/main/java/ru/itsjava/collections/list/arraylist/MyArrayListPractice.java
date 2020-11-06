package ru.itsjava.collections.list.arraylist;

public class MyArrayListPractice {

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list.size());
        list.add("Str1");
        System.out.println(list.size());
        list.add("Str2");
        list.add("Str3");
        list.add("Str4");
        list.add("Str5");
        list.add("Str6");
        list.add("Str7");
        list.add("Str8");
        list.add("Str9");
        list.add("Str10");
        list.add("Str11");
        list.add("Str12");
        list.add(null);
        list.add("Str13");
        System.out.println("После добавления: " + list.size());

        list.remove("Str1");

        System.out.println("После удаления: " + list.size());
        System.out.println(list.toString());

//        System.out.println(list.get(12));
        System.out.println(list.get(0));
        System.out.println(list);
        list.remove(null);
        list.remove("Str13");
    }
}
