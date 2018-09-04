package com.array.examples;

import com.array.examples.utility.ArrayUtility;
import org.junit.Test;

import static com.array.examples.utility.ArrayUtility.arrayString;
import static org.junit.Assert.*;

public class LeftRotationTest {

    @Test
    public void leftRotate() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(arrayString(new int[]{7, 9, 1, 3, 5}), arrayString(LeftRotation.leftRotate(arr, 3)));
        assertEquals(arrayString(new int[]{ 1, 3, 5,7, 9}), arrayString(LeftRotation.leftRotate(arr, 5)));
        assertEquals(arrayString(new int[]{ 9, 1,3, 5,7}), arrayString(LeftRotation.leftRotate(arr, 14)));
    }
}