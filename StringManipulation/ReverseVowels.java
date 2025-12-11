package StringManipulation;

public class ReverseVowels {
    public static String revVowels(String s){
        StringBuilder rev = new StringBuilder(s);
        int l =0;
        int r = rev.length()-1;
        while (l<r) {
            while(l<r &&!isVowel(rev.charAt(l))) {
                l++;
            }  
            while(l<r && !isVowel(rev.charAt(r))) {
                r--;
            }
            
                char left = rev.charAt(l);
                char right = rev.charAt(r);
                rev.setCharAt(l, right);
                rev.setCharAt(r, left);
                l++;
                r--;
            
        }

        return rev.toString();
    }

    public static boolean isVowel(char c){
        if (c == 'a' || c =='e' || c=='o' || c == 'i' || c == 'u' 
        ||c == 'A' || c =='E' || c=='O' || c == 'I' || c == 'U' ) {
            return true;
        }
        return false;
    }

    public static void main(String[] strs){
        String s = "leetcode";
        System.out.println(revVowels(s));
    }


}
