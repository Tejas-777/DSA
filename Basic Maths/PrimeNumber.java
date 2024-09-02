import java.util.Scanner;

/*
Check whether the number is prime or not

 TC - O(sqrt(n))
 SC - O(1)

*/
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        boolean result = isPrime(num);
        System.out.println(result);
    }

    public static boolean isPrime(int num) {
        if(num<=1)
            return false;

        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
