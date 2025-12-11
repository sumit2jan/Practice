package Sorting;

import java.util.Arrays;

public class Selection {
    public static void Selectionsrt(int[] arr){
       for (int i = 0; i < arr.length; i++) {
        int minindex = i;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j]<arr[minindex]) {
                minindex = j;
            }
        }
        if (i != minindex) {
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;

        }
       }
    }
    
    public static void main(String[] args) {
         int[] arr = {2,4,3,7,7,8,10,5,1};
        Selectionsrt(arr);
        System.out.println(Arrays.toString(arr));
    }
}
