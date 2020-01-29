package com.slotvinskiy;

//3) Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно).
// Вывести среднее арифметическое.

import java.util.Arrays;
import java.util.Random;

public class ThirdExercise {

    public static final int ARRAY_SIZE = 10;
    public static final int START = 10;
    public static final int END = 20;
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        int[] array = new int[ARRAY_SIZE];
        initArray(array);
        System.out.println(Arrays.toString(array));
        double arrayAverage = getArrayAverage(array);
        System.out.println(arrayAverage);
    }


    private static double getArrayAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / (double) array.length;
    }

    private static void initArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(END - START + 1) + START;
        }
    }
}

