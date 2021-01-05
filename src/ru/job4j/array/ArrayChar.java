package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int number = pref.length;
        int count = 0;
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] == word[index]) {
                count++;
            } else {
                result = false;
            }
        }
        if (count - number == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
