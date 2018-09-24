package com.array.sorted;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationTest {

    @Test
    public void fetchSorted() {
        Integer[] arr = {1, 2, 7, 9, 19, 23, 34, 27, 88};
        for (int i = 0; i < arr.length; i++) {
            assertEquals("Value at index "+ i, i, ArrayOperation.fetchSorted(arr, arr[i]));
        }
    }

    @Test
    public void test(){
        int i = 2;
        System.out.println("i: " + 2);
    }
}