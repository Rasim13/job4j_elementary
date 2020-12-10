package ru.job4j.condition;

public class Max {

    public static int findMax(int left, int right) {
        return  (left > right) ? left : right;
    }

    public static void main(String[] args) {
        int result = Max.findMax(5, 5);
        System.out.println(result);
    }
}
