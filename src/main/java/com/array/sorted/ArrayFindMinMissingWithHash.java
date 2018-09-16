package com.array.sorted;

import java.util.HashSet;
import java.util.Set;

public class ArrayFindMinMissingWithHash {
    public static void main(String[] args) {
        int a[] = {1, 3, 6, 4, 1, 2};
        int solution = solution(a);
        System.out.println("v : " + solution);
    }

    private static int solution(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int intialPos = 0; intialPos < arr.length; intialPos++) {
            if(arr[intialPos] >= 0){
                set.add(arr[intialPos]);
            }
        }
        if(set.size() == 0){
            return 1;
        }else{
            for (int i = 1;  ; i++) {
                if(!set.contains(i)){
                    return i;
                }
            }
        }
    }

}
