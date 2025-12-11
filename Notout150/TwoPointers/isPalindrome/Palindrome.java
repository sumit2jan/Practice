package Notout150.TwoPointers.isPalindrome;
/*In this method, you sort the array and use two pointers to iterate through the array while maintaining
 a count of consecutive elements to find the longest sequence. This is efficient when combined with sorting.

 Time complexity: O(n)
 Space complexity: O(1)*/

public class Palindrome {
    public static Boolean isPalindrome(String strs){
        int left=0;
        int right = strs.length()-1;
        while (left < right) {
            if (left < right && !spaces(strs.charAt(left))) {
                left++;
            }
            if (left < right && !spaces(strs.charAt(right))) {
                right--;
            }
            if (strs.charAt(left) != strs.charAt(right) ) {
                return false;
               
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean spaces(char c){
        if (c >= 'A'&& c<'Z' || c>='a' && c<='z'|| c>='0' &&c<='9') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String strs = "ollo";
        System.out.println(isPalindrome(strs));
    }
}
