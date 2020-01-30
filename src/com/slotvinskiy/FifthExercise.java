package com.slotvinskiy;

//5*) Написать метод который убирает лишние пробелы в строке и возвращает строку.
//Убрать начальные, конечные и между словами должно быть не больше 1 пробела.

public class FifthExercise {

    public static void main(String[] args) {

        String string1 = "    du  ded  dsf sd   f     ds f    ";
        String resultString = trimAndDeleteDoubleSpaces(string1);
        System.out.println(resultString);
    }

    private static String trimAndDeleteDoubleSpaces(String string1) {
        StringBuilder sb = new StringBuilder(string1.trim());
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == ' ' && sb.charAt(i + 1) == ' ') {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
}
