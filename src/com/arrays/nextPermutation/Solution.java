package com.arrays.nextPermutation;

import com.arrays.utilities.ArrayUtils;
import java.util.Arrays;

public class Solution {

    public static int[] nextPermutation(int[] nums) {
        // Array to track the index of elements to be swapped.
        int[] indices = new int[]{-1,-1};
        // Iterate from the end of array and find the index of first element from the end
        // that is less than the current element.
        // eg: [1,3,4,2] => [1,4,2,3]
        // During first iteration of the outer loop, we identify the swap indices as [3,0] as '2' > '1'. However, during the next iteration we identify another pair '4' and '3'. As the position of '3' < '1', we pick this for swap.
        for (int i=nums.length-1; i>=1; i--) {
            for (int j=i-1; j>=0; j--) {
                if (nums[i] > nums[j] && j > indices[1]) {
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }
        }
        // If we identified the elements to swap.
        if (indices[1] >= 0) {
            swap(nums, indices[0], indices[1]);
        }
        // Sort the remaining array.
        Arrays.sort(nums, indices[1] >= 0 ? indices[1]+1 : 0, nums.length);

        return nums;
    }

    private static void swap(int[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] arr = arrayUtils.inputArray();

        System.out.print("\nSolve: ");

        int[] result = nextPermutation(arr);
        Arrays.stream(result).forEach(num -> System.out.print(num + ", "));
    }
}
