package com.slotvinskiy;

//5*) Написать метод который убирает лишние пробелы в строке и возвращает строку.
//Убрать начальные, конечные и между словами должно быть не больше 1 пробела.

public class FifthExercise {

    public static void main(String[] args) {

        String string1 = "    du  ded  dsf sd   f     ds f    ";
        String resultString = trimAndDeleteDoubleSpaces(string1);
        System.out.println(resultString);
    }

    private static String trimAndDeleteDoubleSpaces(String s) {
        return s.trim().replaceAll("\\s+", " ");
    }
}
