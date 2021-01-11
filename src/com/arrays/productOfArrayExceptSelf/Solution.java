package com.arrays.productOfArrayExceptSelf;

import com.arrays.utilities.ArrayUtils;
import java.util.Arrays;


public class Solution {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] arr = arrayUtils.inputArray();

        System.out.print("\nSolve: ");

        int[] result = new int[arr.length];
        // result[i] contains the product of all the elements to the left
        // Note: for the element at index '0', there are no elements to the left,
        // so the result[0] would be 1
        result[0] = 1;
        for (int i = 1; i < arr.length; i++) {

            // result[i - 1] already contains the product of elements to the left of 'i - 1'
            // Simply multiplying it with arr[i - 1] would give the product of all
            // elements to the left of index 'i'
            result[i] = arr[i - 1] * result[i - 1];
        }
        Arrays.stream(result).forEach(num -> System.out.print(num + ", "));
        System.out.println();

        // 'temp' contains the product of all the elements to the right
        // Note: for the element at index 'arr.length - 1', there are no elements to the right,
        // so the 'temp' would be 1
        int temp = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            // For the index 'i', 'temp' would contain the
            // product of all elements to the right. We update 'temp' accordingly
            result[i] = result[i] * temp;
            temp *= arr[i];
        }
        Arrays.stream(result).forEach(num -> System.out.print(num + ", "));
    }
}
