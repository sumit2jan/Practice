package Sorting;

import java.util.Arrays;

public class Quick {
    public static void Swap(int[]arr, int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    public static int pivot(int[] arr , int pivotIndex , int endIndex){
        int SwapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (arr[i] < arr[pivotIndex]) {
                SwapIndex++;
                Swap(arr, SwapIndex,i );
            }
        }
           Swap(arr, pivotIndex, SwapIndex);
           return SwapIndex;
    }

    public static void Quicksrthelper(int[] arr, int left, int right){
        if (left<right) {
        int pivotindx = pivot(arr, left, right);
        Quicksrthelper( arr,  left, pivotindx-1 );
        Quicksrthelper(arr,pivotindx+1,right);
        }
    }

    public static void Quicksort(int[] arr){
        Quicksrthelper(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        int[] array = {2,4,5,8,9,7,3,1,10};      
        Quicksort(array);
        System.out.println(Arrays.toString(array));
    }
}
