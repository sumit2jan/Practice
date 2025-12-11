package Notout150.TwoPointers.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
/*First lets do this quetion using the brute force approach 
This approach involves checking all possible triplets in the array using three nested loops, leading to a time complexity of O(n³). It’s simple but inefficient for larger datasets.

Time complexity: O(n^3)
Space complexity: O(m)*/
public static List<List<Integer>> ThreeSum(int[] arr){
      Arrays.sort(arr);
        Set<List<Integer>> sums = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k] == 0) {
                        List<Integer> targ = new ArrayList<>();
                        targ.add(arr[i]);
                        targ.add(arr[j]);
                        targ.add(arr[k]);
                        sums.add(targ);
                    }
                }
            }
        }
        return new ArrayList<>(sums);
}
/*After sorting the array, this method fixes one element and uses two pointers to find pairs that sum to a specific target. It has a time complexity of O(n²) and is more efficient than the brute force method.

Time complexity: O(n^2)
Space complexity: O(1) or O(n) depending on the sorting algorithm.*/

public static List<List<Integer>> ThreeSumTwo(int[] arr){
    List<List<Integer>> triplet = new ArrayList<>();
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            break;
        }
        if (i>0 && arr[i]== arr[i-1]) {
            continue;
        }

        int l = i+1;
        int r =arr.length-1;

        while (l<r) {
            int sum = arr[i] + arr[l] + arr[r];
            if (sum > 0) {
                r--;
            }else if(sum < 0){
                l++;
            }else{
                triplet.add(Arrays.asList(arr[i],arr[l],arr[r]));
                l++;
                r--;
                while (l<r && arr[l]==arr[l-1]) {
                    l++;
                }
                 while (l < r && arr[r] == arr[r + 1]) {
                    r--;
                }
            }

        }
    }
    return triplet;
}

public static void main(String[] args) {
    int[] arr ={1,-1,0,0,1,-1,2,1,-3,4,1,-4};
    System.out.println(ThreeSum(arr));
    System.out.println();
    System.out.println(ThreeSumTwo(arr));
}
}
