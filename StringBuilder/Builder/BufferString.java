package StringBuilder.Builder;

public class BufferString {
    public static void main(String[] args) {
        StringBuilder rev = new StringBuilder("hello");
        for(int i=0; i<rev.length()/2; i++){
            int first = i;
            int last = rev.length()-1-i;
            char c = rev.charAt(first);
            char p = rev.charAt(last);

            rev.setCharAt(first,p);
            rev.setCharAt(last, c);
        }
        System.out.println(rev);
    }
}
