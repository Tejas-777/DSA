/* Rotated Pyramid Pattern

 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *

 */
import java.util.*;
public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();
        printpattern(n);

    }

    public static void printpattern(int n){

        for(int i=1; i<=(2 * n)-1; i++){
            int stars = i;
            if(i > n){
                stars = 2*n - i;
            }
            for(int j =1; j<=stars; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
