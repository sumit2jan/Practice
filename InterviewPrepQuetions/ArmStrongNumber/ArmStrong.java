package InterviewPrepQuetions.ArmStrongNumber;

public class ArmStrong {
    public static boolean armStrong(int n){
        int val = n;
        int digits = String.valueOf(n).length();
        int sum = 0;
        while(val > 0){
            int digit = val%10;
            sum += Math.pow(digit,digits);
            val = val/10;
        }
        if (sum == n) {
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(armStrong(153));
        System.out.println(armStrong(1573));
    }
}
