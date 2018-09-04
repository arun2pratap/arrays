package com.array.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayProblems {

        static void pushZerosToEnd(int arr[])
        {
            int count = 0;  // Count of non-zero elements
            int length = arr.length;

            // Traverse the array. If element encountered is
            // non-zero, then replace the element at index 'count'
            // with this element
            for (int counter = 0; counter < length; counter++)
                if (arr[counter] != 0)
                    arr[count++] = arr[counter]; // here count is
            // incremented

            // Now all non-zero elements have been shifted to
            // front and 'count' is set as index of first 0.
            // Make all elements 0 from count to end.
            while (count < length)
                arr[count++] = 0;
        }

    public static void pushZerosToEndSingleRecurrsion(int[] arr) {
        int arrLength = arr.length;
        int count = 0;
        for (int pos = 0; pos < arrLength; pos++) {
            if(arr[pos] != 0){
                arr[count++] = arr[pos];
                arr[pos] = 0;
            }
        }
    }
    static boolean findNumber(List<Integer> list, int k) {
        for (int pos = 0; pos < list.size() ; pos++) {
            if(list.get(pos) == k){
                return true;
            }
        }
        return false;
    }
    public static List<Integer> oddNumbers(int l, int r) {
        List<Integer> list = new ArrayList<Integer>();
        IntStream.rangeClosed(l,r).forEach(number -> {
            if(number%2 != 0){
                list.add(number);
            }
        });
        return list;
    }
}
