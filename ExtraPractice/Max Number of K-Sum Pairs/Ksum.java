import java.util.Arrays;

class Solution {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);   // Step 1: Sort the array

        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                count++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(maxOperations(arr,4));
    }
}
