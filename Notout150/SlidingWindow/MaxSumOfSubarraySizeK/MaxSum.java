package Notout150.SlidingWindow.MaxSumOfSubarraySizeK;

public class MaxSum {
    public static int MaxSum(int[] arr, int k){
        int Max = 0;
        int count =0;
        for (int i = 0; i < k; i++) {
            count+= arr[i];
        }
        Max = count;
        for (int i = k; i < arr.length; i++) {
            count = count -arr[i-k]+arr[i];
            Max = Math.max(Max,count);
        }
        return Max;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(MaxSum(arr, 4));
    }
}
