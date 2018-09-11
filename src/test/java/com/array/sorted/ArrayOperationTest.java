package com.array.sorted;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationTest {

    @Test
    public void fetchSorted() {
        Integer[] arr = {1, 2, 7, 9, 19, 23, 34, 27, 88};
        assertEquals(1, ArrayOperation.fetchSorted(arr, 2));
//        assertEquals(0, ArrayOperation.fetchSorted(arr, 1));
        assertEquals(8, ArrayOperation.fetchSorted(arr, 88));
        assertEquals(5, ArrayOperation.fetchSorted(arr, 23));
    }
}