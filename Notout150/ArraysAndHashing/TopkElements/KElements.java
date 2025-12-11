package Notout150.ArraysAndHashing.TopkElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KElements {
    public static int[] TopkElements(int[] arr, int k){
        Map<Integer,Integer> frequency = new HashMap<>();
        for (int i : arr) {
            frequency.put(i,frequency.getOrDefault(i, 0)+1);
        }

        List<Integer>[] Bucket = new ArrayList[arr.length + 1];
        for (int key : frequency.keySet()) {
            int freq = frequency.get(key);
            if (Bucket[freq] == null) {
                Bucket[freq] = new ArrayList<>();
            }
            Bucket[freq].add(key);
        }

        int[] arrmain = new int[k];
        int count = 0;
        for (int i = Bucket.length-1; i >=0 && count < k ; i--) {
            if (Bucket[i] != null) {
                for(Integer intt : Bucket[i]){
                    arrmain[count++] = intt;
                }
            }
        }
        return arrmain;
    }
}
