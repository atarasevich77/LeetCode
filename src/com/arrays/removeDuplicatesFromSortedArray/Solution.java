package com.arrays.removeDuplicatesFromSortedArray;

import com.arrays.utilities.ArrayUtils;
import java.util.Arrays;

public class Solution {

    public static int removeDuplicates(int[] nums){
        if(nums.length == 0) return 0;

        // Since the array is already sorted, we can keep two pointers 'i' and 'j',
        // where 'i' is the slow-runner while 'j' is the fast-runner.
        // As long as nums[i]=nums[j] we increment 'j' to skip the duplicate.
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            // When we encounter nums[j] != nums[i], the duplicate run has ended
            // so we must copy its value to nums[i+1].
            // 'i' is then incremented and we repeat the same process again until 'j' reaches the end of array.
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] nums = arrayUtils.inputArray();

        int len = removeDuplicates(nums);

        System.out.println("Solve:");
        System.out.print(len + ", [");
        Arrays.stream(nums).forEach(num -> System.out.print(num + ","));
        System.out.print("]\n");
    }
}
