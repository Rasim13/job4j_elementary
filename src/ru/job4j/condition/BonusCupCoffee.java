package ru.job4j.condition;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int rsl;
        if (count > n) {
            rsl = count / n + count;
        } else {
            rsl = count;
        }
        return rsl;
    }
}
