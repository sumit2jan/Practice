package Notout150.ArraysAndHashing.ValidAnagram;
import java.util.Arrays;
import java.util.HashMap;
public class Validanagram {

    // Using the Sorting method Time complexity of this method is O(nlogn)
    public static boolean StrAnagram(String a,String b){
        if (a.length() != b.length()) {
            return false;
        }

        char[] chara = a.toCharArray();
        char[] charb = b.toCharArray();

        Arrays.sort(chara);
        Arrays.sort(charb);

        return Arrays.equals(chara, charb);
    }
    // Using the second approach HasHmap non Optimal

    // public boolean isAnagram(String s, String t) {
    //     if (s.length() != t.length()) {
    //         return false;
    //     }

    //     HashMap countS = new HashMap<>();
    //     HashMap countT = new HashMap<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
    //         countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
    //     }
    //     return countS.equals(countT);
    // }

     // now we are going to do this code with most otimal approcah wiht time complexcity of O(n).

     public static boolean Anagram(String a, String b){
        if (a.length() != b.length()) {
            return false;
        }
         int[] arr = new int[26];
        for (int i = 0; i < a.length(); i++) {
             arr[a.charAt(i) - 'a']++; 
             arr[b.charAt(i) - 'a']--;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
     }

    public static void main(String[] args) {
        String a = "hello";
        String b = "olleh";
        System.out.println( StrAnagram(a, b));
        System.out.println(Anagram(a, b));
    }

}
