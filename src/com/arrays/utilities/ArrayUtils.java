package com.arrays.utilities;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {

    public int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input " + i + " element of array: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("You input array: ");
        System.out.print("[");
        Arrays.stream(arr).forEach(num -> System.out.print(num + ", "));
        System.out.println("]");

        return arr;
    }
}
