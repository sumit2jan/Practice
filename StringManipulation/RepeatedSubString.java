package StringManipulation;

public class RepeatedSubString {

    public static boolean repeatedSubstringPattern(String s){
        int n = s.length();
        for(int i = 1; i<=n/2; i++){
            if (n%i == 0) {
                String sub = s.substring(0, i);
                int subSize = n/i;
                StringBuilder subString = new StringBuilder();

                for(int j = 0; j<subSize; j++){
                    subString.append(sub);
                }
                if (subString.toString().equals(s)) {
                   return true;
                  }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));          // true
        System.out.println(repeatedSubstringPattern("aba"));           // false
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));  // true
        System.out.println(repeatedSubstringPattern("abcd"));          // false
    }
}

