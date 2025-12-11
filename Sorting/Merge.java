package Sorting;

import java.util.Arrays;

public class Merge {
    public static int[] Mergee(int[] arr1 , int[] arr2){
        int[] combined = new int[arr1.length +arr2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i]<arr2[j]) {
                combined[index] = arr1[i];
                i++;
                index++;
            }else{
                combined[index] = arr2[j];
                j++;
                index++;
            }
        }
        while (i < arr1.length) {
            combined[index] = arr1[i];
            i++;
            index++;
        }
        while (j < arr2.length) {
            combined[index] = arr2[j];
            j++;
            index++;
        }
    return combined;

    }

    public static int[] Mergesrt(int[] array){
        if (array.length == 1) {
            return array;
        }
        int midIndex = array.length/2;
        int[] left = Mergesrt(Arrays.copyOfRange(array, 0,midIndex));
        int[] Right = Mergesrt(Arrays.copyOfRange(array, midIndex,array.length));
        return Mergee(left, Right);
    }


    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};

        int[] arr ={2,1,5,4,9,7,3};
        System.out.println(Arrays.toString(Mergee(arr1, arr2)));
        System.out.println(Arrays.toString(Mergesrt(arr)));
    }
}
