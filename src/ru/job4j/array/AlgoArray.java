package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int element = array[i];
                        array[i] = array[j];
                        array[j] = element;
                    }
                }
            }
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
            }
        }

    }

