package Notout150.SlidingWindow.StockProblem;

public class Stock {
    public static int Stock(int[] arr){
        int left = 0;
        int right = 1;
        int max = 0;
        while (right<arr.length) {
            if (arr[left] < arr[right]) {
                max = Math.max(max,arr[right]-arr[left]);
            }else{
                left = right;
            }
            right++;
        }
        return max;
    }

    //Another Method Using Dp TC=O(1), SC=O(n);
    public static int StockDp(int[] arr){
        int minindex = arr[0];
        int max = 0;
        for (int sell : arr) {
            max = Math.max(max, sell-minindex);
            minindex = Math.min(minindex, sell);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Stock(arr));
        System.out.println(StockDp(arr));
    }
}
