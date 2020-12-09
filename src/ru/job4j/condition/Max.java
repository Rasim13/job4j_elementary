package ru.job4j.condition;

public class Max {

    public static int findMax(int left, int right) {
        int max1 = (left > right) ? left : right;
        return max1;
    }

    public static void main(String[] args) {
        int result = Max.findMax(5, 5);
        System.out.println(result);
    }
}
