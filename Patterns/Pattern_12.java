/*

 1      1
 12    21
 123  321
 12344321

 */

import java.util.*;
public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();
        printpattern(n);

    }

    public static void printpattern(int n){

        for(int i=1; i<=n; i++){
                for (int j=1;j<=i;j++){
                    System.out.print(j);
                }
                for (int j=1;j<=2*n-2*i;j++){
                    System.out.print(" ");
                }
                for (int j=i;j>=1;j--){
                    System.out.print(j);
                }
            System.out.println();

        }

    }
}