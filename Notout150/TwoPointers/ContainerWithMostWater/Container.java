package Notout150.TwoPointers.ContainerWithMostWater;

public class Container {

    public static int mostWater(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int maxArea = 0;
        while (left<right) {
            int breath = right - left;
            int capacity = Math.min(arr[left], arr[right]);
            int Area = capacity * breath;
            maxArea = Math.max(maxArea, Area);
            if (arr[left] < arr[right]) {
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] arr = {1,7,2,5,4,7,3,6};
        int[] arr1 = {1,2,5,7,3,6};
        System.out.println(mostWater(arr1));
        System.out.println(mostWater(arr));
    
    
    }
}
