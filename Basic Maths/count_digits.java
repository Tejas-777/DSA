/*
Count the number of digits

(Change class name before executing)
 */



/*
Approach 1 - Maths
TC - O(n)
SC - O(1)
*/


import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int result = count(num);
        System.out.println(result);
    }

    public static int count(int num) {
        if(num==0)
            return 1;
        int count = 0;
        while(num!=0) {
            num/=10;
            count++;
        }
        return count;
    }
}


/*
Approach 2 - Recursion
TC - (log n)
SC - O(log n)
 */

/*
import java.util.Scanner;

public class count_digits_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int result = count(num);
        System.out.println(result);
    }

    public static int count(int num) {
        if(num/10==0)
            return 1;
        return 1+ count(num/10);
    }
}
 */

/*
Approach 3 - Convert num to string and count length
TC - O(1)
SC - O(n)
 */
/*
import java.util.Scanner;

public class count_digits_convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int result = count(num);
        System.out.println(result);
    }

    public static int count(int num) {
        String n = Integer.toString(num);
        int result = n.length();
        return result;
    }
}
*/


