package com.array.challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenSumPairsTest {

    @Test
    public void getEvenSumPairs() {
        int[] arr = {1,2,3,4,5,6};
        assertEquals(6,EvenSumPairs.getEvenSumPairs(arr));
    }
}