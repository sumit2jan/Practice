package Notout150.TwoPointers.TwoSumSortedArray;

import java.util.Arrays;

public class Twosum {
    public static int[] TwoSum(int[] arr,int target){
        int left =0;
        int right = arr.length-1;
        while (left<right) {
            int sum = arr[left] + arr[right];
            if (sum < target) {
                left++;
            }else if(sum > target){
                right--;
            }else{
                return new int[]{left,right};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(TwoSum(arr, 5)));
    }
}
