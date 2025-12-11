package Notout150.ArraysAndHashing.GroupAnagram;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupAna {
    public static  List<List<String>> GroupAnagram(String[] Strs){
        Map<String,List<String>> Anagrams = new HashMap<>();
        for(String s : Strs){
            int[] arr = new int[26];
            for(char c : s.toCharArray()){
                arr[c -'a']++;
            }
            String key = Arrays.toString(arr);
            Anagrams.putIfAbsent(key, new ArrayList<>());
            Anagrams.get(key).add(s);
        }
        return new ArrayList<>(Anagrams.values());
    }
// This method use a hash table with a character frequency count as the key to group words that have the same character counts into the same group.

// Time complexity: O(m*n)
// Space complexity: O(m)
// where m is the number of strings and n is the length of the longest string.

    public static void main(String[] args) {
       String[] Strs = {"act","pots","tops","cat","stop","hat"};
    }
}
