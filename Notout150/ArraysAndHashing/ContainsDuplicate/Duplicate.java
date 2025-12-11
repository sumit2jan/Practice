package Notout150.ArraysAndHashing.ContainsDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {
   // brute force ohk. Time complexity: O(n^2)
    public static boolean Duplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // Using the sorting technique. O(nlogn) Time Complexity

    public static boolean SrtDublicate(int[] arr){
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == arr[i]) {
                return true;
            }
        }
        return false;
    }

    // Using the Hashset which does not allow duplicates to store in an a list Time complexity is of O(n).

    public static boolean HashDublicate(int[] arr){
        Set<Integer>dub = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            if (dub.contains(arr[i])) {
                return true;
            }
            dub.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,4};
       System.out.println( Duplicate(arr));
       System.out.println(SrtDublicate(arr));
       System.out.println(HashDublicate(arr));
    }
}
