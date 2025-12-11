package Searhing;

public class Binary {
    public static int binary(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int midIndex = left + (right-left)/2;
            if (arr[midIndex]==target) {
                return midIndex;
            }
            if (arr[midIndex]<target) {
                left = midIndex+1;
            }else{
                right = midIndex-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8,9};
        System.out.println(binary(arr,4));  
    }
}
