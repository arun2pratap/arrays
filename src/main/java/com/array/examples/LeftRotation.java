package com.array.examples;

public class LeftRotation {
    public static int[] leftRotate(int arr[], int numberOfRotation) {
        int length = arr.length;
        int[] leftRotatedArr = new int[length];
        int move = numberOfRotation%length;
        for (int pos = 0; pos < length; pos++) {
            leftRotatedArr[pos] = arr[move%length];
            move++;
        }
        return leftRotatedArr;
    }
}
