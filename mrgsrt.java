import java.util.Arrays;

public class mrgsrt {

    public static int[] mrg(int[] arr1, int[] arr2){
        int[] combined = new int[arr1.length+arr2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i] < arr2[j]) {
            combined[index] = arr1[i];
            index++;
            i++;
        }else{
            combined[index] = arr2[j];
            index++;
            j++;
        }
    }

       while (i<arr1.length) {
        combined[index] = arr1[i];
        index++;
        i++;
       }
       while (j<arr2.length) {
        combined[index] = arr2[j];
        index++;
        j++;
       }
       return combined;
        
    }

    public static int[] mrgesrt(int[] arr){
        if (arr.length == 1) {
            return arr;
        }
         int mid = arr.length/2;

        int[] left = mrgesrt(Arrays.copyOfRange(arr, 0,mid));
        int[] right = mrgesrt(Arrays.copyOfRange(arr, mid,arr.length));
        return mrg(left, right);
    }
    public static void main(String[] args) {

        int[] arr1 = {2,5,6};
        int[] arr2 = {1,3,6};
        System.out.println(Arrays.toString(mrg(arr1, arr2)));
        int[] arr = {2,3,4,5,8,9,7,6};
        System.out.println(Arrays.toString(mrgesrt(arr)));

        
    }
}
