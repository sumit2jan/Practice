package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class Exceptionn {
    public static void main(String[] args) {
        //Basic try = Block of code where you write risky code.
        // catch = Handles the exception.
        try {
            int a = 10;
            int b = 0;
            int c = a / b;  // risky code
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        System.out.println("Program continues...");

        //Multiple catch blocks  
        try {
          int[] arr = new int[3];
          arr[5] = 10;  // risky code
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of range!");
        } catch (Exception e) {
            System.out.println("Some other error!");
        }

        //finally block = Always executes (used for cleanup code).
        try {
            int num = 10 / 0;
        } catch (ArithmeticException e) {
          System.out.println("Error: " + e.getMessage());
        } finally {
          System.out.println("Finally block always executes!");
        }

        // throw keyword = Used to throw an exception manually.
        int age = 15;
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("Eligible to vote");


    /* throws keyword = Declares that a method might throw an exception.
    class Main {
        static void readFile() throws IOException {
        FileReader fr = new FileReader("file.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
    }*/
    }
}
