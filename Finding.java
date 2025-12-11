
import java.util.*;

public class Finding {
//Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5

public static int kthElement(int[] arr, int k){
    HashSet<Integer> freq = new HashSet<>();
    for (int i : arr) {
        freq.add(i);
    }
    while (k>1) {
        int val = Collections.max(freq);
        freq.remove(val);
        k--;
    }
    return Collections.max(freq);

    // List<Integer> value = new ArrayList<>();
    // for (Integer i : freq) {
    //     value.add(i);
    // }

    // return value.get(value.size()-k);
}

public static void main(String[] args) {
    int[] arr = {3,2,1,5,6,4};
    int[] arr1 = {3,2,3,1,2,4,5,5,6};
    System.out.println(kthElement(arr,2));//5
    System.out.println(kthElement(arr1,4 )); //4
}
}
