package com.array.examples;

import com.array.examples.utility.ArrayUtility;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PushZerosToEndTest {

    @Test
    public void pushZerosToEnd() {
        int[] arr =  {0,6,7,0,3,5,0,1,0};;
        ArrayProblems.pushZerosToEnd(arr);
        ArrayUtility.printArray(arr);
    }

    @Test
    public void pushZerosToEndSingleRecurrsion() {
        int[] arr =  {0,6,7,0,3,5,0,1,0};;
        ArrayProblems.pushZerosToEndSingleRecurrsion(arr);
        ArrayUtility.printArray(arr);
    }

    @Test
    public void findANumber() {
        List<Integer> arr = Arrays.asList(1,3,4,56,8,9);
        assertTrue(ArrayProblems.findNumber(arr, 8));
        assertFalse(ArrayProblems.findNumber(arr, 78));
    }
    @Test
    public void findOddNumbers() {
        List<Integer> oddNumbers = ArrayProblems.oddNumbers(2, 5);
        System.out.println(oddNumbers);
    }
}