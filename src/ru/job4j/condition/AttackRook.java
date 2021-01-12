package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        boolean rsl = false;
        char firstSymbol = left.charAt(0);
        char secondSymbol = right.charAt(0);
        char thirdSymbol = left.charAt(1);
        char fourthSymbol = right.charAt(1);
        if (firstSymbol == secondSymbol) {
            rsl = true;
        } else if (thirdSymbol == fourthSymbol) {
            rsl = true;
        }
        return rsl;
    }
}
