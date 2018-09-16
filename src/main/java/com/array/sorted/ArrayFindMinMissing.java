package com.array.sorted;

public class ArrayFindMinMissing {
    public static void main(String[] args) {
        int a[] = {1, 3, 6, 4, 1, 2};
        int solution = solution(a);
        System.out.println("v : " + solution);
    }

    private static int solution(int[] arr) {
        int smallestPositive = Integer.MAX_VALUE;
        for (int intialPos = 0; intialPos < arr.length; intialPos++) {
            int plusOne = arr[intialPos] + 1;
            if(plusOne < 1){
                plusOne = 1;
            }
            if (plusOne < smallestPositive) {
                if (!siblingExists(arr, plusOne, intialPos)) {
                    smallestPositive = plusOne;
                }
            }
        }
        return smallestPositive;
    }

    private static boolean siblingExists(int[] a, int minVal, int i) {
        for (int k = i; k >= 0; k--) {
            if (minVal == a[k]) {
                return true;
            }
        }
        for (int j = i; j < a.length; j++) {
            if (minVal == a[j]) {
                return true;
            }
        }
        return false;
    }
}
