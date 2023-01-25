package org.example;

public class HomeWorkPartTwo {

    public void multByThreeTable() {
        for (int i = 1; i <= 10; i++)
            System.out.println(i + " * 3 = " + i * 3);
    }

    public void printAverage() {
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Среднее арефметическое от 1 до 100: " + sum / 100);
    }

    public void divideByTwo(double x) {
        if (x < 50) {
            System.out.println("X Меньше 50");
            return;
        }
        int step = 0;
        while (x >= 50) {
            step++;
            x = x/2;
        }
        System.out.println("Х = " + x + " Шаг = " + step);
    }

}
