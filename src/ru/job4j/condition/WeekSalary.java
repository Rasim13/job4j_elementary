package ru.job4j.condition;

public class WeekSalary {
    public static int calculate(int[] hours) {
        int payEight = 10;
        int payEightUp = 15;
        int rsl = 0;
        for (int i = 0; i <= 4; i++) {
            if (hours[i] == 8) {
                rsl += hours[i] * payEight;
            } else if (hours[i] > 8) {
                rsl += (hours[i] - 8) * payEightUp + 8 * payEight;
            } else if (hours[i] == 0) {
                continue;
            }
        }
            for (int j = 5; j <= 6; j++) {
               if (j == 5 && hours[j] > 8) {
                    rsl += (hours[j] - 8) * payEightUp * 2 + 8 * payEight * 2;
                } else if (j == 5 && hours[j] < 8) {
                    rsl += hours[j] * payEight * 2;
                } else if (j == 6 && hours[j] > 8) {
                    rsl += (hours[j] - 8) * payEightUp * 2 + 8 * payEight * 2;
                } else if (j == 6 && hours[j] < 8) {
                    rsl += hours[j] * payEight * 2;
                }
            }

        return rsl;
    }

}
