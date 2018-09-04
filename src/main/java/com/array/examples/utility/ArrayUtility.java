package com.array.examples.utility;

public class ArrayUtility {
    public static void printArray(int[] arr) {
        System.out.print("arr:[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.print(" ]");
    }
    public static String arrayString(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder(""+arr[0]);
        for (int i = 1; i < arr.length; i++) {
            stringBuilder.append(", " + arr[i]);
        }
        return stringBuilder.toString();
    }
}
