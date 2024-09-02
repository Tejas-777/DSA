/*
Palindrome number - NUmber should be same while reading from left to right and right to left

TC - O(log n)
SC - O(1)
*/
import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        boolean result = palindrome(num);
        System.out.println(result);

    }

    public static boolean palindrome(int num){

        int rev = 0;
        int y  = num;

        if(num<0){
            return false;
        }

        while(num!=0){
            int last = num%10;
            rev = (rev*10) + last;
            num/=10;
        }

        if(rev == y){
            return true;
        }
        else
            return false;


    }
}
