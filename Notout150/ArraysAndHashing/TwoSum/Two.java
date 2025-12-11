package Notout150.ArraysAndHashing.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two {


  // Brute Force Method O(n^2)
    public static int[] TwoSum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j] == target) {
                   return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    // Now we are attemting this question with using hasmap.Time complexity: O(n)

    public static int[] HasTwoSM(int[] arr, int target){
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            index.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (index.containsKey(diff)  && index.get(diff) != i) {
                return new int[] {i,index.get(diff)};
            }
        }
         return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(TwoSum(arr,9)));
         System.out.println(Arrays.toString(HasTwoSM(arr,9)));
    }
}
