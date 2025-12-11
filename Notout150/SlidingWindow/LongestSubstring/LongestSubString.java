package Notout150.SlidingWindow.LongestSubstring;
import java.util.*;

public class LongestSubString {
    public static int SubStringlong(String strs){
        Set<Character> subString = new HashSet<>();
        int left = 0;
        int maxSize = 0;
        for (int right = 0; right < strs.length(); right++) {
            while(subString.contains(strs.charAt(right))) {
                subString.remove(strs.charAt(left));
                left++;
            }
            subString.add(strs.charAt(right));
            maxSize = Math.max(maxSize, right-left +1);
        }
        return maxSize;
    }

    public static void main(String[] args) {
        String strs = "HELLO";
        System.out.println(SubStringlong(strs));
    }
}
