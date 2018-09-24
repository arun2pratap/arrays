package com.array.challenges;

public class EvenSumPairs {

    public static int getEvenSumPairs(int[] array) {

        int even = 0;
        int odd = 0;
        int evenSum = 0;

        for (int j = 0; j < array.length; ++j) {
            if (array[j] % 2 == 0) even++;
            else odd++;
        }
        evenSum = ((even * (even - 1) / 2) + (odd * (odd - 1) / 2));
        return evenSum;
    }

}
