package InterviewPrepQuetions.isPrime;

public class isPrime {
    public static boolean isPrimee(int val){
        if (val <= 1) {
            return false;
        }
        for(int i = 2; i<= Math.sqrt(val); i++){
            if (val % i == 0) {
                return false;
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrimee(3));
    }
}
