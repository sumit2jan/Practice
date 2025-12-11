package InterviewPrepQuetions.FindingmaxInArray;

public class FindingMax {
    public static void main(String[] ard){
        int[] arr = {11,8,9,7,10};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
           max =  Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}
