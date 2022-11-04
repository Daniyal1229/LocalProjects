package InterviewRelatedStuff;

public class PrimeNumber {
    public static void main(String[] args) {
        int min = 2;
        int max = 100;
        for (int n=min; n<=max; n++){
            if (isPrime(n)) {
                System.out.println(n + " is a prime number.");
            }
        }
    }
    public static boolean isPrime(int num){
        for (int i=2; i<= num/2; i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
}
