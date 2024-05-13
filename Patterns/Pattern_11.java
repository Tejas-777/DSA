/*

 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1

 */

import java.util.*;
public class Pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();
        printpattern(n);

    }

    public static void printpattern(int n){

        for(int i=0; i<n; i++){
            int start = 1;
            if(i%2 == 0) {
                start = 1;
            }else{
                start = 0;
            }
            for(int j=0; j<=i; j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }

    }
}