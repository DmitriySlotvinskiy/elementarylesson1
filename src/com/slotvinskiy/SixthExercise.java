package com.slotvinskiy;

//6*) Задан 2-мерный массив char и слово.
// Написать метод который определит есть ли по вертикали или горизонтали это слово.
// Например, в данном случае для слова test метод должен вернуть true:
//a z r g z
//a t e s t
//q v u t r

public class SixthExercise {

    public static final int ROWS = 3;
    public static final int COLUMNS = 5;
    public static final String SOURCE_STRING = "azrgzatestqvutr";

    public static void main(String[] args) {
        String searchWord = "test";
        char[][] array = initCharArray();
        printArray(array);
        boolean isWord = isWordInArray(array, searchWord);
        if (isWord) {
            System.out.println("Yes, there is word " + searchWord);
        } else {
            System.out.println("No, there isn't word " + searchWord);
        }
    }

    private static boolean isWordInArray(char[][] array, String searchWord) {
        boolean isWord = false;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (array[i][j] == searchWord.charAt(0)) {
                    isWord = isWordInHorizontal(array, i, j, searchWord);
                    if (isWord) {
                        return true;
                    } else {
                        isWord = isWordInVertical(array, i, j, searchWord);
                        if (isWord) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean isWordInVertical(char[][] array, int i, int j, String word) {
        if (word.length() + i <= ROWS) {
            for (int k = 1; k < word.length(); k++) {
                if (word.charAt(k) != array[i + k][j]) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    private static boolean isWordInHorizontal(char[][] array, int i, int j, String word) {
        if (word.length() + j <= COLUMNS) {
            for (int k = 1; k < word.length(); k++) {
                if (word.charAt(k) != array[i][j + k]) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    private static void printArray(char[][] array) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static char[][] initCharArray() {
        char[] sourceArray = SOURCE_STRING.toCharArray();
        char[][] array = new char[ROWS][COLUMNS];
        int sourceArrIndex = 0;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++, sourceArrIndex++) {
                if (sourceArrIndex < sourceArray.length) {
                    array[i][j] = sourceArray[sourceArrIndex];
                } else {
                    array[i][j] = '*';
                }
            }
        }
        return array;
    }
}
