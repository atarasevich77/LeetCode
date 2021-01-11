package com.arrays.nextPermutation;

import com.arrays.utilities.ArrayUtils;

import java.util.Arrays;

public class Solution {

    public static int[] nextPermutation(int[] nums) {
        int[] res = new int[nums.length];


        return res;
    }

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] arr = arrayUtils.inputArray();

        System.out.print("\nSolve: ");

        int[] result = nextPermutation(arr);
        Arrays.stream(result).forEach(num -> System.out.print(num + ", "));
    }
}
