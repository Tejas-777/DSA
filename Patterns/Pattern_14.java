/*

 A
 AB
 ABC
 ABCD

 */

import java.util.*;
public class Pattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();
        printpattern(n);

    }

    public static void printpattern(int n){
        for(int i=0; i<n; i++){
            for(char ch ='A'; ch<= 'A'+i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}