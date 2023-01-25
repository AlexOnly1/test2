package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final String FIRST_TASK = "1 - Таблица умножения на 3";
    private static final String SECOND_TASK = "2 - Среднее арифметическое";
    private static final String THIRD_TASK = "3 - Деление Х на 2 пока оно не будет меньше 50";
    private static final String INVALID_INPUT = "Вы ввели неверное значение";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(FIRST_TASK);
        System.out.println(SECOND_TASK);
        System.out.println(THIRD_TASK);

        try {
            int taskNumber = input.nextInt();
            switch (taskNumber) {
                case 1: {
                    HomeWorkPartTwo homeWorkPartTwo = new HomeWorkPartTwo();
                    homeWorkPartTwo.multByThreeTable();
                    break;
                }
                case 2: {
                    HomeWorkPartTwo homeWorkPartTwo = new HomeWorkPartTwo();
                    homeWorkPartTwo.printAverage();
                    break;
                }
                case 3: {
                    System.out.println("Введите Х");
                    double x = input.nextDouble();
                    new HomeWorkPartTwo().divideByTwo(x);
                }

            }
        } catch (InputMismatchException exception) {
            System.out.println(INVALID_INPUT);
        }
    }

}