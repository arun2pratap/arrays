package com.array.sorted;

import java.util.function.Function;

public class ArrayOperation {


    //    public static<T,U> Function<T, U> getLamda(){
//        return str -> (U)str;
//    }
//
    public static <T extends Comparable<T>> int fetchSorted(T[] sortedArr, T element) {
        int start = 0;
        int end = sortedArr.length - 1;
        int mid = 0;
        for (; start <= end; start++) {
            mid = (end - start) / 2;
            int compare = element.compareTo(sortedArr[mid]);
            if (compare == 0) {
                return mid;
            } else if (compare < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return mid;
    }
}
