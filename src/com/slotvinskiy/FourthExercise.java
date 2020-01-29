package com.slotvinskiy;

//4) Написать метод который вернет String в которой будут в одну строку числа от 1 до 30.
// Каждое число при этом взять в круглые скобки ()

public class FourthExercise {

    public static final int STRINGS_ELEMENTS_NUMBER = 30;

    public static void main(String[] args) {

        String string = createString();
        System.out.println(string);
    }

    private static String createString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= STRINGS_ELEMENTS_NUMBER; i++) {
            sb.append("(").append(i).append(")");
        }
        return sb.toString();
    }
}
