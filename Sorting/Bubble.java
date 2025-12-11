package Sorting;
import java.util.Arrays;

public class Bubble {
    public static void Bubblesrt(int[] array){
        for (int i = array.length-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j+1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,3,7,7,8,10,5,1};
        Bubblesrt(arr);
        System.out.println(Arrays.toString(arr));
    }
}