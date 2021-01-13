package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        boolean rsl = false;
        if (l.isEmpty() && r.isEmpty()) {
            rsl = true;
        } else if (!(l.isEmpty()) && r.isEmpty()) {
            rsl = false;
        } else if (l.charAt(0) == r.charAt(r.length() - 1)
                && l.charAt(l.length() - 1) == r.charAt(0)) {
            rsl = true;
        }
        return rsl;
    }
}
