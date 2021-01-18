package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        boolean rsl = false;
        char[] ch = new char[left.length()];
        char[] ch1 = new char[right.length()];
        for (int i = 0; i < left.length(); i++) {
            ch[i] = left.charAt(i);
            ch1[i] = right.charAt(i);
        }
        for (int i = 0; i < left.length(); i++) {
            if (ch[i] == ch1[i]) {
                rsl = true;
            }
        }

            return rsl;
    }
}
