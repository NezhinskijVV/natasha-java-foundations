package ru.itsjava.collections.list.arraylist;


import java.util.Arrays;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private int realSize;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public boolean add(Object o) {
        if (realSize == array.length) {
            var resArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
        }
        array[realSize++] = o;
        return true;
    }

    //              0 1 2 3
    //  array       3 7 9 10

    //              0 1 2
    //resArray      3 7 10

    public boolean remove(Object o) {
//        Object[] resArray = new Object[realSize - 1];
        int delIndex = -1;
        for (int i = 0; i < realSize; i++) {
            if (o.equals(array[i])) {
                delIndex = i;
                break;
            }
//            resArray[i] = array[i];
        }
        if (delIndex == -1) return false;

        for (int i = delIndex; i < realSize - 1; i++) {
            array[i] = array[i + 1];
        }
//        array = resArray;
        realSize--;
        array[realSize] = null;
        return true;
    }

    public void clear() {

    }

    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    private void checkIndex(int index) {
        if ((index >= realSize) || (index < 0)) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyArrayList{" + Arrays.toString(array) + '}';
    }
}

//ДЗ:
//1. Реализовать оставшиеся методы
//toString()  //не забыть про StringBuilder
//проверки на null
//2. Тесты на все методы
//3. SOLID Чистая архитектура Роберт Мартин