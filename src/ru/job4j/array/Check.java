package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        int count = 0;
        for (int index = 0; index < data.length; index++) {
            if (data[0] == data[index]) {
                count++;
            } else {
                result = false;
            }
         }
        if (count == data.length) {
            return result;
        } else {
            result = false;
        }
        return result;
    }
}
