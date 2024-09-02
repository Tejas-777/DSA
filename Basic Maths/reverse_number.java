/*
Reverse the number of

(Change class name before executing)
 */



/*
Approach 1 - Using modulo
TC - O(log n)
SC - O(1)
*/


import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int result = reverse(num);
        System.out.println(result);
    }

    public static int reverse(int num) {
        if(num==0)
            return 0;

        int reverse = 0;
        while(num>0){
        int n = num%10;
        reverse = reverse*10 + n;
        num/=10;
        }
        return reverse;
    }
}


/*
Approach 2 - Recursion
TC - O(log n)
SC - O(log n)
 */

/*
import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int result = reverse(num);
        System.out.println(result);
    }

    static int rev = 0;

    public static int reverse(int num){

        if(num<=0)
            return rev;

        int rem = num%10;
        rev = (rev*10) +rem;
        reverse(num/10);
        return rev;

    }

}

*/


/*
Approach 3 - Using StringBuilder class
TC - O(1)
SC - O(n)
 */






