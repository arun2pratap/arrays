package com.array.sorted;

public class ArrayOperation {

    public static <T extends Comparable<T>> int fetchSorted(T[] sortedArr, T element) {
        int start = 0;
        int end = sortedArr.length;
        int mid = 0;
        for (; start <= end; ) {
            mid =  (end + start) / 2;
            int compare = element.compareTo(sortedArr[mid]);
            if (compare == 0) {
                return mid;
            } else if (compare < 0) {
                end = mid;
            } else {
                start = mid +1;
            }
        }
        return -1;
    }
}
