/*

 A
 BB
 CCC
 DDDD
 EEEEE

 */

import java.util.*;
public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();
        printpattern(n);

    }

    public static void printpattern(int n){
        for(int i=0; i<n; i++){
            char ch = (char)('A'+i);
            for(int j=0; j<=i; j++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}