package Sorting;

import java.util.Arrays;

public class Insertion {

    public static void Insertionsrt(int[] array){
        for (int i = 1; i < array.length; i++) {
            int j = i-1;
            int temp = array[i];
            while (j > -1 && temp < array[j]) {
                array[j+1] = array[j];
                array[j] = temp;
                j--;
            }
            
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,3,7,7,8,10,5,1};
        Insertionsrt(arr);
        System.out.println(Arrays.toString(arr));
    }
}