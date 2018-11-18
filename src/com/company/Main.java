package com.company;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fifthTask();
        sixthTask();
        seventhTask();
    }

    ////////////////////////////////
    public static void firstTask() {
        int i = 573, j = -1;
        String myString = "J = ";
        System.out.println(myString + j);
    }

    ////////////////////////////////
    public static void secondTask() {
        double pi = 3.14159265358979;
        System.out.println("PI = " + pi);
    }

    ////////////////////////////////
    public static void thirdTask() {
        int result = math(1346, 36);
        System.out.println(result);
    }

    static int math(int secondInt, int firstInteger) {
        return secondInt + firstInteger;
    }

    ////////////////////////////////
    public static void fourthTask() {
        boolean result = isDivisibleThree(9);
        System.out.println(result);
    }

    static boolean isDivisibleThree(int num) {
        if (num % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    ////////////////////////////////
    public static void fifthTask() {
        boolean result = isBelongToSection(10, 2, 6, 9, 12);
        System.out.println(result);
    }

    static boolean isBelongToSection(int x, int fromA, int toB, int fromSecondA, int toSecondB) {
        if ((x >= fromA && x <= toB) || (x >= fromSecondA && x <= toSecondB)) {
            return true;
        } else {
            return false;
        }
    }

    ////////////////////////////////
    public static void sixthTask() {
        int[] array = {10, 50, 18, 193, 591, 561};
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    static void reverseArray(int[] someArray) {
        int last = someArray.length - 1;
        for (int i = 0; i < last; i++) {
            int tmp = someArray[i];
            someArray[i] = someArray[last];
            someArray[last] = tmp;
            --last;
        }
    }

    ////////////////////////////////
    public static void seventhTask() {
        int[] array = {1, 8, 1, 67, 52, 45, 257, 3571, 246, 23, 0, 919, 0};
        printMaxOfArray1(array);
        printMaxOfArray2(array);
    }

    static void printMaxOfArray1(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    static void printMaxOfArray2(int[] array) {
        for (int k = 1; k < array.length; k++) {
            int newElement = array[k];
            int location = k - 1;
            while (location >= 0 && array[location] > newElement) {
                array[location + 1] = array[location];
                location--;
            }
            array[location + 1] = newElement;
        }
        System.out.println(array[array.length - 1]);

    }


}
