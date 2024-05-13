/*

 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15

 */

import java.util.*;
public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();
        printpattern(n);

    }

    public static void printpattern(int n){
        int p=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++) {
                System.out.print(p+" ");
                p++;
            }
            System.out.println();

        }

    }
}