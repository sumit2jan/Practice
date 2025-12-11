package InterviewPrepQuetions.Factorial;

public class factorial {
    public static int factorial(int val){
        if (val == 0 || val == 1) {
            return 1;
        }
        return val * factorial(val-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
