package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean rsl = false;
        for (int i = 0; i < array.length - 1; i++) {
            rsl = array[i] < array[i + 1];
        }
        return rsl;
    }
}
