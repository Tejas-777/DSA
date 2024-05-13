/*

 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15

 */

import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();
        printpattern(n);

    }

    public static void printpattern(int n){
        int i=1;
        int j=1;
        while (i<=n){
            for(int k=1;k<=j;k++){
                System.out.print(i+" ");
                i++;
            }
            System.out.println();
            j++;
        }

    }
}