package Notout150.ArraysAndHashing.ProductOfArrayExceptSelf;

import java.util.Arrays;

public class Product {
    //Brute Force Approach. O(n^2)
    public static int[] ProductArr(int[] arr){
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int prod = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    prod = prod * arr[j];
                }
            }
            array[i] = prod;
        }
    return array;

    }

    /* Now we are going to write the code for the Optimal approach Where we are going to First
       calculate the left size of product then simply multiply with it with the right side of the product.*/

    public static int[] ProductAr(int[] arr){
        int n = arr.length;
        int[] array = new int[n];
        array[0] = 1;
        // we are calculating all the element which are left to the specific element in the array.
        for (int i = 1; i < n; i++) {
            array[i] = array[i-1] * arr[i-1];
        }
        // Now we calculate all the right side and multiply it with the left side of the element and give the final result.
        int postFix = 1;
        for (int i = n-1; i >=0; i--) {
            array[i] *= postFix;
            postFix *= arr[i];
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(ProductArr(arr)));
        System.out.println(Arrays.toString(ProductAr(arr)));
    }
}