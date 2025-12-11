package StringManipulation;
import java.util.*;

public class Brackets {
    // a2345b outpuit will be 1
    public static int Bracketss(String strs){
        int n = 0;
        if (strs.length() <= 1) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < strs.length()-1; i++) {
            if ( Character.isLetter(strs.charAt(i)) == true) {
                 j = i+1;
            }
            while (j < strs.length()-1 && Character.isDigit(strs.charAt(j)) == true) {
                    j++;
            }
            if (i + 1 < strs.length() && j < strs.length() && Character.isDigit(strs.charAt(i+1))  && 
            Character.isDigit(strs.charAt(j-1)) && Character.isLetter(strs.charAt(j)) ) {
                 n++;
            }
           
            i=j-1;
        }
        return n;
    }

    public static void main(String args[]){
      String s1 = "a126b12c655354b3543d3453f";
      String s2 = "a12648";
      String s3 = "abcd";
      String s4 = "a12b12c12d";
      String s5 = "ab12c";
      String s6 = "a112b2342c";
      System.out.println(Bracketss(s1));
      System.out.println(Bracketss(s2));
      System.out.println(Bracketss(s3));
      System.out.println(Bracketss(s4));
      System.out.println(Bracketss(s5));
      System.out.println(Bracketss(s6));
    }
}