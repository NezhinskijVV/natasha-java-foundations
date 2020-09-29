package ru.itsjava.core;

public class BinarySearch {

    public static void main(String[] args) {
        var array = new int[]{-3, 0, 4, 8, 15, 31, 43};

        int indexElem = binarySearch(-3, 0, array.length, array);

        System.out.println("Индекс исходного элемента " + indexElem);
    }


    private static int binarySearch(int num, int start, int end, int[] array) {
        int midIndex = start + (end - start) / 2;
        //базовый случай
        if (array[midIndex] == num) {
            return midIndex;
        } else if (array[midIndex] < num) {
            return binarySearch(num, midIndex + 1, end, array);
        }
        return binarySearch(num, start, midIndex - 1, array);
    }
}
