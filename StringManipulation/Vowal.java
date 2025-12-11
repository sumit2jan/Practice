package StringManipulation;
import java.util.Scanner;

public class Vowal {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String word  = sc.nextLine();
          int count = 0;
          for(char c : word.toCharArray()){
            if (c == 'a' || c== 'i'|| c =='e' || c == 'o' || c =='u') {
                count ++;
            }
          }
          System.out.println(count);
          sc.close();
    }
}
