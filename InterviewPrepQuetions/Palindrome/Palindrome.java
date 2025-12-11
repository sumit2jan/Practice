package InterviewPrepQuetions.Palindrome;

public class Palindrome {
    public static Boolean isPalindrome(String str){
        int l = 0;
        int r = str.length()-1;
        while(l < r){
            if (isCharOrDigit(str.charAt(l)) == false ) {
                l++;
            }
            if(isCharOrDigit(str.charAt(r)) == false){
                r--;
            }
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;

    }

    public static Boolean isCharOrDigit(char c){
        if (c >= 'A' && c <= 'z' ) {
            return true;
        }
         if (c >= 'a' && c <= 'b' ) {
            return true;
        }
        if (c >= '0' && c <= '9' ) {
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        String str = "HELLEH";
        String strs = "hecdedf";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(strs));
    }
}
