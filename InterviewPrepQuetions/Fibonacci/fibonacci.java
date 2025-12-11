package InterviewPrepQuetions.Fibonacci;

public class fibonacci {
    //Using the Recursion
    public static int fibonacciRecursion(int val){
      if (val == 1) {
        return 1;
      }
      if(val == 0){
        return 0;
      }

      return fibonacciRecursion(val-1) + fibonacciRecursion(val-2); 

    }

    // Without recirsion
    public static int fib(int n) {
    if (n <= 1) return n;
    int a = 0, b = 1, c = 0;
    for (int i = 2; i <= n; i++) {
        c = a + b;
        a = b;
        b = c;
    }
    return c;
}
    public static void main(String[] args) {
        int val = 10;
        for (int i = 0; i <= val; i++) {
            System.out.print(" " +fibonacciRecursion(i));
        }
        System.out.println(fib(val));
        
    }
}
