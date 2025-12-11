package Notout150.ArraysAndHashing.StringHighestFrequency;
import java.util.*;
public class Highest {
    public static List<String> StringHighestFrequency(String[] strs){
       LinkedHashMap<String  , Integer > freq = new LinkedHashMap<>();
       for (String s : strs) {
        String key = " "+s.charAt(0)+s.charAt(s.length()-1);
        freq.put(key, freq.getOrDefault(key,0)+1);
       }

       List<String> fnlres = new ArrayList<>();
       int maxVal = Collections.max(freq.values());
       for (String str : freq.keySet()) {
        if (freq.get(str) == maxVal) {
            fnlres.add(str);
        }
       }
       return fnlres;

    }
    public static void main(String[] args) {
        String[] strs ={"apple","ball","art","bat","ant","air","affe"};
        System.out.println(StringHighestFrequency(strs));

    }
}
