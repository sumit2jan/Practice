package PractriceQuetions.String;

import java.util.Stack;

public class ReverseString {
    //Using StringBuilder.reverse() method
    public static void main(String[] args) {
        String s = "Geeks";
        StringBuilder res = new StringBuilder();
        // Appending elements of s in res
        res.append(s);
        // reverse StringBuilder res
        res.reverse();
        System.out.println(res);

        System.out.println("\n");

        // Using Character Array
        char[] arr = s.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }

        System.out.println("\n");

        // Using Stack.

        String neww = "Hello Dunia";
        Stack<Character> l = new Stack<>();
        for(char c : neww.toCharArray()){
            l.push(c);
        }

        String reverse = "";
            while (!l.isEmpty()) {
                reverse += l.pop();
            }
            System.out.println(reverse);



    }
}
