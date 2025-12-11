package InterviewPrepQuetions.StringReversal;

import java.util.Collections;
import java.util.Stack;

public class Reversal {
    public static void main(String[] args){
        String strs = "Hello World";
        // using for loop to reverse a String
        char[] arr1 = strs.toCharArray();
        for(int i = arr1.length-1; i>=0; i--){
            System.out.print(arr1[i]);
        }
        System.out.println();

        // now using Stack
        Stack<Character> stack = new Stack<>();
        for (Character c : arr1) {
            stack.push(c);
        }

        String reverse = "";
        while (!stack.isEmpty()) {
            reverse +=  stack.pop();
        }
        System.out.println(reverse);

        // using optimised approach using String Builder

        StringBuilder str = new StringBuilder("Hello World");
        for(int i = 0; i < str.length()/2; i++){
        int l = i;
        int r = str.length()-1-l;
    
        char left = str.charAt(l);
        char right = str.charAt(r);

        str.setCharAt(l,right);
        str.setCharAt(r, left);
    }
        System.out.println(str);


    }
}
