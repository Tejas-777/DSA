/* Left Half Filled Pattern

 *
 * *
 * * *
 * * * *

 */
import java.util.*;
public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of * : ");
        int n = sc.nextInt();
        printpattern(n);

    }

    public static void printpattern(int n){

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
