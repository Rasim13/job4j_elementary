package ru.job4j.loop;

public class ChekPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        int count = 2;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
