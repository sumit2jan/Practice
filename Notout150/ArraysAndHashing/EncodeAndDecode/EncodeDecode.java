package Notout150.ArraysAndHashing.EncodeAndDecode;

import java.util.ArrayList;
import java.util.List;

// encoding the String.
public class EncodeDecode {
    public static String Encode(String[] strs){
        StringBuilder encode = new StringBuilder();
        for (String s : strs) {
            encode.append(s.length()).append('#').append(s);
        }
        return encode.toString();
    }

// Decoding the String.
    public static List<String> Decode(String strs){
        List<String> decode = new ArrayList<>();
        int i = 0;
        while(i< strs.length()){
            int j = i;
            while (strs.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(strs.substring(i, j));
            i = j+1;
            j = i+length;
            decode.add(strs.substring(i,j));
            i = j;
        }
        return decode;
   
    }
    public static void main(String[] args) {
        String[] mine = {"Hello","World","I","am","Sumit","Singh"};
        System.out.println("Encrypting the Value: "+Encode(mine));
        System.out.println("Decrypting the value: "+Decode(Encode(mine)));
    }
}

// This method store the length of each string before the string itself during encoding. During decoding, read the length first to extract the exact substring, avoiding delimiter-related issues.

// Time complexity: O(m) for encode() and decode().
// Space complexity: O(1) for encode() and decode().
// where m is the sum of lengths of all the strings and n is the number of strings.